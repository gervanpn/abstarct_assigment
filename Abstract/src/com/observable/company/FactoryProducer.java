package com.observable.company;

import com.observable.company.Interfaces.IColor;
import com.observable.company.Interfaces.IShape;

public class FactoryProducer{ //extends AbstractFactory {

    private AbstractFactory thisFactory;
    private IColor color;
    private IShape shape;

    public FactoryProducer(AbstractFactory _factory){
         this.thisFactory = _factory;
         this.color = null;
         this.shape = null;
    }
    public FactoryProducer(AbstractFactory _factory, IColor _color){
        this.thisFactory = _factory;
        this.thisFactory.setColor(_color);
    }
    public FactoryProducer(AbstractFactory _factory, IShape _shape){
        this.thisFactory = _factory;
        this.thisFactory.setShape(_shape);
    }

    public AbstractFactory getFactory(){
        return this.thisFactory;
    }

    public IColor getColor(){
        return this.thisFactory.getColor();
    }

    public IShape getShape(){
        return this.thisFactory.getShape();
    }

}
