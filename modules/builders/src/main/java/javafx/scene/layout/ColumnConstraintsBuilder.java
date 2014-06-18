/* 
 * Copyright (c) 2011, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javafx.scene.layout;

/**
Builder class for javafx.scene.layout.ColumnConstraints
@see javafx.scene.layout.ColumnConstraints
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class ColumnConstraintsBuilder<B extends javafx.scene.layout.ColumnConstraintsBuilder<B>> implements javafx.util.Builder<javafx.scene.layout.ColumnConstraints> {
    protected ColumnConstraintsBuilder() {
    }
    
    /** Creates a new instance of ColumnConstraintsBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.layout.ColumnConstraintsBuilder<?> create() {
        return new javafx.scene.layout.ColumnConstraintsBuilder();
    }
    
    private int __set;
    public void applyTo(javafx.scene.layout.ColumnConstraints x) {
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setFillWidth(this.fillWidth);
        if ((set & (1 << 1)) != 0) x.setHalignment(this.halignment);
        if ((set & (1 << 2)) != 0) x.setHgrow(this.hgrow);
        if ((set & (1 << 3)) != 0) x.setMaxWidth(this.maxWidth);
        if ((set & (1 << 4)) != 0) x.setMinWidth(this.minWidth);
        if ((set & (1 << 5)) != 0) x.setPercentWidth(this.percentWidth);
        if ((set & (1 << 6)) != 0) x.setPrefWidth(this.prefWidth);
    }
    
    private boolean fillWidth;
    /**
    Set the value of the {@link javafx.scene.layout.ColumnConstraints#isFillWidth() fillWidth} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B fillWidth(boolean x) {
        this.fillWidth = x;
        __set |= 1 << 0;
        return (B) this;
    }
    
    private javafx.geometry.HPos halignment;
    /**
    Set the value of the {@link javafx.scene.layout.ColumnConstraints#getHalignment() halignment} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B halignment(javafx.geometry.HPos x) {
        this.halignment = x;
        __set |= 1 << 1;
        return (B) this;
    }
    
    private javafx.scene.layout.Priority hgrow;
    /**
    Set the value of the {@link javafx.scene.layout.ColumnConstraints#getHgrow() hgrow} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B hgrow(javafx.scene.layout.Priority x) {
        this.hgrow = x;
        __set |= 1 << 2;
        return (B) this;
    }
    
    private double maxWidth;
    /**
    Set the value of the {@link javafx.scene.layout.ColumnConstraints#getMaxWidth() maxWidth} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B maxWidth(double x) {
        this.maxWidth = x;
        __set |= 1 << 3;
        return (B) this;
    }
    
    private double minWidth;
    /**
    Set the value of the {@link javafx.scene.layout.ColumnConstraints#getMinWidth() minWidth} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B minWidth(double x) {
        this.minWidth = x;
        __set |= 1 << 4;
        return (B) this;
    }
    
    private double percentWidth;
    /**
    Set the value of the {@link javafx.scene.layout.ColumnConstraints#getPercentWidth() percentWidth} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B percentWidth(double x) {
        this.percentWidth = x;
        __set |= 1 << 5;
        return (B) this;
    }
    
    private double prefWidth;
    /**
    Set the value of the {@link javafx.scene.layout.ColumnConstraints#getPrefWidth() prefWidth} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B prefWidth(double x) {
        this.prefWidth = x;
        __set |= 1 << 6;
        return (B) this;
    }
    
    /**
    Make an instance of {@link javafx.scene.layout.ColumnConstraints} based on the properties set on this builder.
    */
    public javafx.scene.layout.ColumnConstraints build() {
        javafx.scene.layout.ColumnConstraints x = new javafx.scene.layout.ColumnConstraints();
        applyTo(x);
        return x;
    }
}
