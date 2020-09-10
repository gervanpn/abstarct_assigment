package com.observable.company;

import com.observable.company.Colors.Red;
import com.observable.company.Interfaces.IColor;
import com.observable.company.Interfaces.IShape;
import com.observable.company.Shapefolder.Circle;

public class PatternDemo {


    public static void main(String[] args) {

        FactoryProducer fp = new FactoryProducer("color", "green");
//        fp.getFactory().getShape().draw();
        fp.getFactory().getColor().fill();
    }
}
