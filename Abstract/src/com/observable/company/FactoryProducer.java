package com.observable.company;

import com.observable.company.Interfaces.IColor;
import com.observable.company.Interfaces.IShape;

public class FactoryProducer{ //extends AbstractFactory {

    private AbstractFactory thisFactory;
    private IColor color;
    private IShape shape;

    public FactoryProducer(AbstractFactory _factory){
    //public FactoryProducer(IColor _color, IShape _shape){
        this.thisFactory = _factory;
        //thisFactory. = _color;
        //this.shape = _shape;
    }
    public FactoryProducer(AbstractFactory _factory, IColor _color){
        //public FactoryProducer(IColor _color, IShape _shape){
        this.thisFactory = _factory;
        this.thisFactory.setColor(_color);
        //this.thisFactory.setShape(_shape);
        //this.shape = _shape;
    }
    public FactoryProducer(AbstractFactory _factory, IShape _shape){
        //public FactoryProducer(IColor _color, IShape _shape){
        this.thisFactory = _factory;
        //this.thisFactory.setColor(_color);
        this.thisFactory.setShape(_shape);
        //this.shape = _shape;
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
