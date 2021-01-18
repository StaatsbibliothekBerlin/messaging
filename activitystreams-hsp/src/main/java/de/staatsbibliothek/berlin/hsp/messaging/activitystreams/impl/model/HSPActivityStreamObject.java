/*
 * MIT License
 *
 * Copyright (c) 2020 Staatsbibliothek zu Berlin - Preußischer Kulturbesitz
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.exceptions.ActivityStreamsException;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamObject;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamObjectBuilder;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamObjectTag;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamsDokumentTyp;
import de.staatsbibliothek.berlin.hsp.messaging.objectfactory.TEIObjectFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.xml.bind.JAXBException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tei_c.ns._1.TEI;

/**
 * @author piotr.czarnecki@sbb.spk-berlin.de
 * @since 01.04.20
 */
public class HSPActivityStreamObject<T> implements ActivityStreamObject {

  private static final Logger log = LoggerFactory.getLogger(
      HSPActivityStreamObject.class);

  @JsonProperty("id")
  private String id;
  @JsonProperty("groupId")
  private String groupId;
  @JsonProperty("name")
  private String name;
  @JsonProperty("version")
  private String version;
  @JsonProperty("compressed")
  private boolean compressed;
  @JsonProperty("type")
  private String type;
  @JsonProperty("url")
  private String url;
  @JsonProperty("tag")
  private List<ActivityStreamObjectTag> tag;
  @JsonProperty("mediaType")
  private String mediaType;
  @JsonProperty("content")
  protected String content;

  HSPActivityStreamObject() {
    compressed = true;
    tag = new ArrayList<>();
  }

  private HSPActivityStreamObject(HSPActivityStreamObjectBuilder builder) throws ActivityStreamsException {
    this.id = builder.id;
    this.groupId = builder.groupId;
    this.name = builder.name;
    this.compressed = builder.compressed;
    Objects.requireNonNull(builder.type, "Type parameter is required and can't be null");
    setType(builder.type);
    this.url = builder.url;
    this.tag = builder.tag;
    this.mediaType = builder.mediaType;

    if (builder.tei != null) {
      setContent(builder.tei);
    }

    if (builder.string != null) {
      setContent(builder.string);
    }

    if (builder.bytes != null) {
      setContent(builder.bytes);
    }
  }

  @Override
  public ActivityStreamsDokumentTyp getType() {
    return ActivityStreamsDokumentTyp.valueFrom(type);
  }

  @Override
  public void setType(ActivityStreamsDokumentTyp type) {
    this.type = type != null ? type.toString() : null;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String getGroupId() {
    return groupId;
  }

  @Override
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getVersion() {
    return version;
  }

  @Override
  public boolean isCompressed() {
    return compressed;
  }

  @Override
  public void setCompressed(boolean compressed) {
    this.compressed = compressed;
  }

  @Override
  public String getUrl() {
    return url;
  }

  @Override
  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public List<ActivityStreamObjectTag> getTag() {
    return tag;
  }

  public void setTag(List<ActivityStreamObjectTag> tag) {
    this.tag = tag;
  }

  @Override
  public String getMediaType() {
    return mediaType;
  }

  @Override
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  @JsonIgnore
  public void setContent(String content) throws ActivityStreamsException {
    setContent(content.getBytes(StandardCharsets.UTF_8));
  }

  @JsonIgnore
  public void setContent(byte[] content) throws ActivityStreamsException {
    try (
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzipOutputStream = new GZIPOutputStream(out);
    ) {

      if (compressed) {
        gzipOutputStream.write(content, 0, content.length);
        gzipOutputStream.finish();
        gzipOutputStream.flush();
        this.content = Base64.getEncoder().encodeToString(out.toByteArray());
      } else {
        this.content = Base64.getEncoder().encodeToString(content);
      }


    } catch (IOException e) {
      log.error("Unable to convert content", e);
      throw new ActivityStreamsException("Unable to convert content", e);
    }

  }

  @JsonIgnore
  public void setContent(TEI contentFromTEI) throws ActivityStreamsException {
    try {
      String marshal = TEIObjectFactory.marshal(contentFromTEI);

      setContent(marshal.getBytes(StandardCharsets.UTF_8));
      version = contentFromTEI.getVersion();

    } catch (JAXBException e) {
      log.error("Unable to convert TEI to Content", e);
      throw new ActivityStreamsException("Unable to convert TEI to Content", e);
    }
  }

  @Override
  @JsonIgnore
  public byte[] getContent() throws ActivityStreamsException {
    if (Objects.isNull(content)) {
      return null;
    }

    try (InputStream byteArrayInputStream = new ByteArrayInputStream(Base64.getDecoder().decode(content))) {

      if (compressed) {
        try (GZIPInputStream gzipInputStream = new GZIPInputStream(byteArrayInputStream)) {
          return gzipInputStream.readAllBytes();
        }
      }

      return byteArrayInputStream.readAllBytes();

    } catch (IOException e) {
      throw new ActivityStreamsException(e);
    }

  }

  public static ActivityStreamObjectBuilder builder() {
    return new HSPActivityStreamObjectBuilder();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HSPActivityStreamObject that = (HSPActivityStreamObject) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(groupId, that.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId);
  }

  @Override
  public String toString() {
    StringBuilder tagContent = new StringBuilder();

    if (tag == null) {
      tagContent.append("null");
    } else {
      tag.forEach(hspActivityStreamObjectTag -> {
        tagContent.append(hspActivityStreamObjectTag.toString());
        tagContent.append("  ");
      });
    }

    return new StringJoiner(", ", HSPActivityStreamObject.class.getSimpleName() + "[", "]")
        .add("id='" + id + "'")
        .add("groupId='" + groupId + "'")
        .add("name='" + name + "'")
        .add("version='" + version + "'")
        .add("compressed=" + compressed)
        .add("type=" + type)
        .add("url='" + url + "'")
        .add("content='" + content + "'")
        .add("tag='" + tagContent.toString() + "'")
        .toString();
  }

  public static class HSPActivityStreamObjectBuilder implements ActivityStreamObjectBuilder {

    private String id;
    private String groupId;
    private String name;
    private boolean compressed;
    private ActivityStreamsDokumentTyp type;
    private String url;
    public String mediaType;
    private List<ActivityStreamObjectTag> tag = new ArrayList<>();
    private TEI tei;
    private String string;
    private byte[] bytes;

    private HSPActivityStreamObjectBuilder() {
    }

    @Override
    public ActivityStreamObjectBuilder withId(String id) {
      this.id = id;
      return this;
    }

    @Override
    public ActivityStreamObjectBuilder withGroupId(String groupId) {
      this.groupId = groupId;
      return this;
    }

    @Override
    public ActivityStreamObjectBuilder withName(String name) {
      this.name = name;
      return this;
    }

    @Override
    public ActivityStreamObjectBuilder withCompressed(boolean compressed) {
      this.compressed = compressed;
      return this;
    }

    @Override
    public ActivityStreamObjectBuilder withType(ActivityStreamsDokumentTyp type) {
      this.type = type;
      return this;
    }

    @Override
    public ActivityStreamObjectBuilder withUrl(String url) {
      this.url = url;
      return this;
    }

    @Override
    public ActivityStreamObjectBuilder withMediaType(String mediaType) {
      this.mediaType = mediaType;
      return this;
    }

    @Override
    public ActivityStreamObjectBuilder withContent(String content) {
      this.string = content;
      return this;
    }

    @Override
    public ActivityStreamObjectBuilder withContent(TEI content) {
      this.tei = content;
      return this;
    }

    @Override
    public ActivityStreamObjectBuilder withContent(byte[] content) {
      this.bytes = content;
      return this;
    }

    @Override
    public ActivityStreamObjectBuilder withTag(List<ActivityStreamObjectTag> tag) {
      this.tag = tag;
      return this;
    }

    @Override
    public HSPActivityStreamObject build() throws ActivityStreamsException {
      return new HSPActivityStreamObject(this);
    }

  }

}
