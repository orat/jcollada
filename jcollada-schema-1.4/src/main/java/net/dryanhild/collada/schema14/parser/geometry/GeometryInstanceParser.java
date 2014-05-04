/*
 * Copyright (c) 2014 D. Ryan Hild <d.ryan.hild@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package net.dryanhild.collada.schema14.parser.geometry;

import net.dryanhild.collada.data.geometry.GeometryInstance;
import net.dryanhild.collada.schema14.data.geometry.GeometryInstanceImpl;
import net.dryanhild.collada.schema14.parser.AbstractParser;
import org.jvnet.hk2.annotations.Service;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

@Service
public class GeometryInstanceParser extends AbstractParser<GeometryInstance> {

    @Override
    public String getExpectedTag() {
        return "instance_geometry";
    }

    @Override
    protected GeometryInstance createObject(XmlPullParser parser) throws XmlPullParserException, IOException {
        return setAttributes(parser, null);
    }

    @Override
    protected GeometryInstance handleAttribute(GeometryInstance object, String attribute, String value) {
        if (attribute.equals("url")) {
            return GeometryInstanceImpl.createSoftReference(value);
        }
        return object;
    }
}
