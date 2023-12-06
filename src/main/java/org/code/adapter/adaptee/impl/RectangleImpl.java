package org.code.adapter.adaptee.impl;

import org.code.adapter.adaptee.Rectangle;

public class RectangleImpl implements Rectangle {
    private final double length;
    private final double width;

    public RectangleImpl(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
