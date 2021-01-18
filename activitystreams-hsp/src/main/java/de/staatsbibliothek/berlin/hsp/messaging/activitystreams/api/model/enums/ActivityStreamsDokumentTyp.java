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

package de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums;

/**
 * @author piotr.czarnecki@sbb.spk-berlin.de
 * @since 03.04.20
 * <p>
 * The Class presents all message types which are relevant for the handschriftenportal project communication.
 */
public enum ActivityStreamsDokumentTyp {
  KOD, BESCHREIBUNG, ORT, KOERPERSCHAFT, IMPORT, BEZIEHUNG, DIGITALISAT, SPRACHE;

  public static ActivityStreamsDokumentTyp valueFrom(String type) {

    try {
      return Enum.valueOf(ActivityStreamsDokumentTyp.class, type.toUpperCase());
    } catch (IllegalArgumentException | NullPointerException error) {
      return null;
    }
  }
}
