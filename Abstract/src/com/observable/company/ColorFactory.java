package com.observable.company;

import com.observable.company.Interfaces.IColor;
import com.observable.company.Interfaces.IShape;

public class ColorFactory extends AbstractFactory {

    IColor color;

    public ColorFactory(IColor color) {
        this.color = color;
    }

    @Override
    public IShape getShape() {
        return null;
    }

    @Override
    public IColor getColor() {
        System.out.println(this.color + "has been created.");
        return null;
    }


}
