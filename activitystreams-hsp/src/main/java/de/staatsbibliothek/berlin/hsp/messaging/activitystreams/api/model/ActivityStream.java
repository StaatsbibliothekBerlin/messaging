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

import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamAction;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.model.ActivityStreamMessage;
import java.time.LocalDateTime;
import java.util.List;


public interface ActivityStream extends HSPJsonTypes {

  static ActivityStreamBuilder builder() {

    return ActivityStreamMessage.builder();

  }

  String getContext();

  void setContext(String context);

  String getId();

  void setId(String id);

  String getVersion();

  String getSummary();

  void setSummary(String summary);

  ActivityStreamAction getAction();

  void setAction(ActivityStreamAction action);

  LocalDateTime getPublished();

  void setPublished(LocalDateTime published);

  ActivityStreamActor getActor();

  void setActor(ActivityStreamActor actor);

  List<ActivityStreamObject> getObjects();

  void addObject(ActivityStreamObject object);

  void removeObject(ActivityStreamObject object);

  ActivityStreamTarget getTarget();

  void setTarget(ActivityStreamTarget target);

}



