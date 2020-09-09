package com.observable.company;

import java.awt.*;

public class ColorFactory extends AbstractFactory {

    Color color;

    public ColorFactory(Color color) {
        this.color = color;
    }

    @Override
    public Shape getShape() {
        return null;
    }

    @Override
    public Color getColor() {
        System.out.println(this.color + "has been created.");
        return null;
    }


}
