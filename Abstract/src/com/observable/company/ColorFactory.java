package com.observable.company;

import com.observable.company.Colors.Blue;
import com.observable.company.Colors.Green;
import com.observable.company.Colors.Red;
import com.observable.company.Interfaces.IColor;
import com.observable.company.Interfaces.IShape;

import java.awt.*;

public class ColorFactory extends AbstractFactory {

    String color;
    IColor icolor;

    public ColorFactory(String color) {
        this.color = color;
    }

    @Override
    public IColor getColor() {
        switch (color) {
            case "red":
                icolor = new Red();
            case "green":
                icolor = new Green();
            default:
                icolor = new Blue();
        }
        return icolor;
    }

    @Override
    public IShape getShape() {
        return null;
    }


}
