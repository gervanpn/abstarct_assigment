package com.observable.company;

import com.observable.company.Interfaces.IColor;
import com.observable.company.Interfaces.IShape;

public class FactoryProducer {

    AbstractFactory ap;
    public FactoryProducer(String type, String inst) {
        switch (type) {
            case "shape":
                ap = new ShapeFactory(inst);
                break;
            case "color":
                ap = new ColorFactory(inst);
                break;
        }
    }

    public AbstractFactory getFactory() {
       return ap;
    }


}
