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

import com.fasterxml.jackson.annotation.JsonProperty;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.exceptions.ActivityStreamsException;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStream;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamActor;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamBuilder;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamObject;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamTarget;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamAction;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;


public class ActivityStreamMessage implements ActivityStream {

  @JsonProperty("@context")
  private String context;
  @JsonProperty("id")
  private String id;
  @JsonProperty("action")
  private String action;
  @JsonProperty("version")
  private String version;
  @JsonProperty("published")
  private LocalDateTime published;
  @JsonProperty("summary")
  private String summary;
  @JsonProperty("objects")
  private List<ActivityStreamObject> objects;
  @JsonProperty("actor")
  private ActivityStreamActor actor;
  @JsonProperty("target")
  private ActivityStreamTarget target;

  protected ActivityStreamMessage() {
    this.objects = new ArrayList<>();
    this.actor = new HSPActivityStreamActor();
    this.target = new HSPActivityStreamTarget();
  }

  public ActivityStreamMessage(ActivityStreamMessageBuilder builder) {
    this();
    id = builder.id;
    setAction(builder.action);
    published = builder.published;
    actor.setId(id);
    actor = new HSPActivityStreamActor();
    actor.setName(builder.actorName);
    target.setId(id);
    target.setName(builder.targetName);
    objects.addAll(builder.objects);
    this.version = determineVersion();

  }

  public static ActivityStreamBuilder builder() {
    return new ActivityStreamMessageBuilder();
  }

  private String determineVersion() {
    return ActivityStreamVersion.V1_0.toString();
  }

  public String getContext() {
    return context;
  }

  @Override
  public void setContext(final String context) {
    this.context = context;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(final String id) {
    this.id = id;
  }

  @Override
  public String getSummary() {
    return summary;
  }

  @Override
  public void setSummary(String summary) {
    this.summary = summary;
  }

  @Override
  public ActivityStreamAction getAction() {
    return ActivityStreamAction.valueFrom(action);
  }

  @Override
  public void setAction(final ActivityStreamAction action) {
    this.action = action != null ? action.toString() : null;
  }

  @Override
  public LocalDateTime getPublished() {
    return published;
  }

  @Override
  public void setPublished(final LocalDateTime published) {
    this.published = published;
  }

  @Override
  public ActivityStreamActor getActor() {
    return actor;
  }

  @Override
  public void setActor(ActivityStreamActor actor) {
    this.actor = actor;
  }

  @Override
  public String getVersion() {
    return version;
  }

  @Override
  public List<ActivityStreamObject> getObjects() {
    return objects;
  }

  @Override
  public void addObject(ActivityStreamObject object) {
    objects.add(object);
  }

  @Override
  public void removeObject(ActivityStreamObject object) {
    objects.remove(object);
  }

  @Override
  public ActivityStreamTarget getTarget() {
    return target;
  }

  @Override
  public void setTarget(ActivityStreamTarget target) {
    this.target = target;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityStreamMessage that = (ActivityStreamMessage) o;
    return Objects.equals(context, that.context) &&
        Objects.equals(id, that.id) &&
        action == that.action &&
        Objects.equals(published, that.published) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(objects, that.objects) &&
        Objects.equals(actor, that.actor) &&
        Objects.equals(version, that.version) &&
        Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, id, action, published, summary, objects, actor, target, version);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", ActivityStreamMessage.class.getSimpleName() + "[", "]")
        .add("context='" + context + "'")
        .add("id='" + id + "'")
        .add("action=" + action)
        .add("published=" + published)
        .add("summary='" + summary + "'")
        .add("objects=" + objects)
        .add("actor=" + actor)
        .add("target=" + target)
        .toString();
  }

  protected enum ActivityStreamVersion {

    V1_0;

    @Override
    public String toString() {
      switch (this) {
        case V1_0:
          return "1.0";
        default:
          return "";
      }
    }
  }

  public static class ActivityStreamMessageBuilder implements ActivityStreamBuilder {

    private String id;
    private ActivityStreamAction action;
    private List<ActivityStreamObject> objects;
    private LocalDateTime published;
    private String actorName;
    private String targetName;

    private ActivityStreamMessageBuilder() {
      objects = new ArrayList<>();
    }

    @Override
    public ActivityStreamBuilder withId(String id) {
      this.id = id;
      return this;
    }

    @Override
    public ActivityStreamBuilder withType(ActivityStreamAction action) {
      this.action = action;
      return this;
    }

    @Override
    public ActivityStreamBuilder addObject(ActivityStreamObject object) {
      this.objects.add(object);
      return this;
    }

    @Override
    public ActivityStreamBuilder withPublished(LocalDateTime published) {
      this.published = published;
      return this;
    }

    @Override
    public ActivityStreamBuilder withActorName(String actorName) {
      this.actorName = actorName;
      return this;
    }

    @Override
    public ActivityStreamBuilder withTargetName(String targetName) {
      this.targetName = targetName;
      return this;
    }

    @Override
    public ActivityStream build() throws ActivityStreamsException {
      return new ActivityStreamMessage(this);
    }
  }
}

