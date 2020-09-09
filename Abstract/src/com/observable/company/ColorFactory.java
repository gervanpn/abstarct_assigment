package com.observable.company;

import java.awt.*;

public class ColorFactory extends AbstractFactory {

    IColor color;

    public ColorFactory(IColor color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        System.out.println(this.color + "has been created.");
        return this.color;
    }


}
