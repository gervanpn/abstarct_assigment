
package com.observable.company;

import com.observable.company.Colors.Blue;
import com.observable.company.Colors.Green;
import com.observable.company.Colors.Red;
import com.observable.company.Interfaces.IColor;
import com.observable.company.Interfaces.IShape;
import com.observable.company.Shapefolder.Circle;
import com.observable.company.Shapefolder.Rectangle;
import com.observable.company.Shapefolder.Square;

public class ShapeFactory extends AbstractFactory {
    IShape shape;

    public ShapeFactory(String shape) {
        this.shape = shape;
    }

    @Override
    public IShape getShape() {
        //System.out.println(this.shape.toString() + " has been created.");
        return this.shape;
    }


    @Override
    public IColor getColor() {
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
