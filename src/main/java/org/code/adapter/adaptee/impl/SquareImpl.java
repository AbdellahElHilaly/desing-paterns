package org.code.adapter.adaptee.impl;

import org.code.adapter.adaptee.Square;

public class SquareImpl implements Square {

    private final double side;

    public SquareImpl(double side) {
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side * side;
    }
}
