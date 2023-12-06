package org.code.adapter;

import org.code.adapter.adaptee.Rectangle;
import org.code.adapter.adaptee.Square;
import org.code.adapter.adaptee.impl.RectangleImpl;
import org.code.adapter.adapter.RectangleAdapter;

public class Client {






    public static void main(String[] args) {


        Rectangle rectangle = new RectangleImpl(10, 20);

        Square square = new RectangleAdapter(rectangle);



    }



}
