package com.observable.company.Colors;

import com.observable.company.Interfaces.IColor;

public class Green implements IColor {
    @Override
    public void fill() {
        System.out.println("Green Color");
    }
}