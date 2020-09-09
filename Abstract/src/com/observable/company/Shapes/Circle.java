package com.observable.company.Shapes;

import com.observable.company.Interfaces.IShape;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("this is a circle");
    }
}
