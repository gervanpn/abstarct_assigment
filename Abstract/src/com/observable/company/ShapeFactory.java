
package com.observable.company;

import com.observable.company.Interfaces.IColor;
import com.observable.company.Interfaces.IShape;
import com.observable.company.Shapefolder.Circle;
import com.observable.company.Shapefolder.Rectangle;
import com.observable.company.Shapefolder.Square;

public class ShapeFactory extends AbstractFactory {

    String shape;
    IShape ishape;

    public ShapeFactory(String shape) {
        this.shape = shape;
    }

    @Override
    public IShape getShape() {
        switch (shape) {
            case "circle":
                ishape = new Circle();
            case "square":
                ishape = new Square();
            case "rectangle":
                ishape = new Rectangle();
        }
        return ishape;
    }


    @Override
    public IColor getColor() {
        return null;
    }
}