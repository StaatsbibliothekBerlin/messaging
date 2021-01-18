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

package de.staatsbibliothek.berlin.hsp.messaging.common;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import java.util.HashMap;
import java.util.Map;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 12.05.2020.
 * @version 1.0
 */
public class TEINamespaceMapper extends NamespacePrefixMapper {

  private static String XML_XSI_URI = "http://www.w3.org/2001/XMLSchema-instance";

  private static String XML_XSI_PREFIX = "xsi";

  private static String XML_XI_URI = "http://www.w3.org/2001/XInclude";

  private static String XML_XI_PREFIX = "xi";

  private static String DCR_PREFIX = "dcr";

  private static String DCR_URI = "http://www.isocat.org/ns/dcr";

  private static final String EGXML_URI = "http://www.tei-c.org/ns/Examples";

  private static final String EGXML_PREFIX = "egXML";

  private Map<String, String> namespaces = new HashMap<>();

  public TEINamespaceMapper() {

    namespaces.put(XML_XSI_URI, XML_XSI_PREFIX);
    namespaces.put(DCR_URI, DCR_PREFIX);
    namespaces.put(EGXML_URI, EGXML_PREFIX);
    namespaces.put(XML_XI_URI, XML_XI_PREFIX);
  }

  @Override
  public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {

    if (namespaces.containsKey(namespaceUri)) {
      return namespaces.get(namespaceUri);
    }

    return suggestion;
  }

  @Override
  public String[] getPreDeclaredNamespaceUris() {
    return namespaces.keySet().toArray(new String[]{});
  }
}
