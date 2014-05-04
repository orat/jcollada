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
package net.dryanhild.collada.data;

import net.dryanhild.collada.VersionSupport;
import net.dryanhild.collada.data.fx.Effect;
import net.dryanhild.collada.data.fx.Material;
import net.dryanhild.collada.data.geometry.Geometry;
import net.dryanhild.collada.data.scene.Node;
import net.dryanhild.collada.data.scene.VisualScene;

import javax.validation.constraints.NotNull;

public interface ColladaDocument {

    Iterable<Geometry> getGeometries();

    Geometry getGeometry(@NotNull String id);

    Iterable<Node> getNodes();

    Node getNode(@NotNull String id);

    Iterable<VisualScene> getVisualScenes();

    VisualScene getVisualScene(@NotNull String id);

    Iterable<? extends Effect> getEffects();

    Effect getEffect(@NotNull String id);

    Iterable<? extends Material> getMaterials();

    Material getMaterial(@NotNull String id);

    VisualScene getMainScene();

    VersionSupport getVersion();

}
