
package com.observable.company;

public class ShapeFactory implements AbstractFactory {

    IShape shape;

    public ShapeFactory(IShape shape) {
        this.shape = shape;
    }

    @Override
    public IShape getShape() {
        System.out.println(this.shape + "has been created.");
    }

}