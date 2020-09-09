package com.observable.company.Shapefolder;

import com.observable.company.Interfaces.IShape;

public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("this is a square");
    }
}
