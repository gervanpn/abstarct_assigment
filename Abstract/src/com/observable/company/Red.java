package com.observable.company;

import com.observable.company.Interfaces.IColor;

public class Red implements IColor {
    @Override
    public void fill() {
        System.out.println("Red Color");
    }
}