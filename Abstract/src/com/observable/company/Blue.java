package com.observable.company;

import com.observable.company.Interfaces.IColor;

public class Blue implements IColor {
    @Override
    public void fill() {
        System.out.println("Blue Color");
    }
}