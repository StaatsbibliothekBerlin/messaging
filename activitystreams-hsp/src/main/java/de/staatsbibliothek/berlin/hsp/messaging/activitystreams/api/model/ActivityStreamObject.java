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

package de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model;

import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.exceptions.ActivityStreamsException;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamsDokumentTyp;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.model.HSPActivityStreamObject;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.model.HSPActivityStreamObjectTag;
import java.util.List;

/**
 * @author piotr.czarnecki@sbb.spk-berlin.de
 * @since 01.04.20
 */
public interface ActivityStreamObject extends HSPJsonTypes {

  static ActivityStreamObjectBuilder builder() {

    return HSPActivityStreamObject.builder();
  }

  String getId();

  void setId(String id);

  String getGroupId();

  void setGroupId(String groupId);

  String getName();

  void setName(String name);

  String getVersion();

  ActivityStreamsDokumentTyp getType();

  void setType(ActivityStreamsDokumentTyp type);

  boolean isCompressed();

  void setCompressed(boolean compressed);

  String getUrl();

  void setUrl(String url);

  List<ActivityStreamObjectTag> getTag();

  void setTag(List<ActivityStreamObjectTag> tag);

  String getMediaType();

  void setMediaType(String mediaType);

  byte[] getContent() throws ActivityStreamsException;
}
