package com.observable.company;

import java.awt.*;

public class ShapeFactory extends AbstractFactory {
    Shape shape;

    public ShapeFactory(Shape shape) {
        this.shape = shape;
    }

    @Override
    public Shape getShape() {
        System.out.println(this.shape + "has been created.");
    }

    @Override
    public Color getColor() {
        //return null;
    }


}