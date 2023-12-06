package org.code.adapter.adapter;


import org.code.adapter.adaptee.Rectangle;
import org.code.adapter.adaptee.Square;

public class RectangleAdapter implements Square {

    private final Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public double calculateArea() {
        return rectangle.calculateArea();
    }



}

