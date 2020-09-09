package com.observable.company;

import com.observable.company.Interfaces.*;
import com.observable.company.Shapes.*;
import com.observable.company.Colors.*;

public class PatternDemo {

    public static void main(String[] args) {

        IColor red = new Red();
        IShape circle = new Circle();

        ColorFactory clr = new ColorFactory(red);
        ShapeFactory shp = new ShapeFactory(circle);

        FactoryProducer clrFactory = new FactoryProducer(clr, red);
        FactoryProducer shpFactory = new FactoryProducer(shp, circle);
        clr.getColor();
        shp.getShape();
        //shpFactory.getFactory().getShape().draw();
    }
}
