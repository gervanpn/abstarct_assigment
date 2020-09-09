
package com.observable.company;

import com.observable.company.Interfaces.IColor;
import com.observable.company.Interfaces.IShape;

public class ShapeFactory extends AbstractFactory {
    IShape shape;

    public ShapeFactory(IShape shape) {
        this.shape = shape;
    }

    @Override
    public IShape getShape() {
        //System.out.println(this.shape.toString() + " has been created.");
        return this.shape;
    }

    @Override
    public IColor getColor() {
        //return null;
        return null;
    }

    @Override
    public void setShape(IShape _shape) {
        this.shape = _shape;
    }

    @Override
    public void setColor(IColor _color) {

    }


}
