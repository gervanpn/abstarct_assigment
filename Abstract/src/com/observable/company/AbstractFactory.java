package com.observable.company;

import com.observable.company.Interfaces.IColor;
import com.observable.company.Interfaces.IShape;

public abstract class AbstractFactory {

    public abstract IShape getShape();
    public abstract IColor getColor();
}
