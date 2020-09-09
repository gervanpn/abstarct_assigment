package com.observable.company;

public class FactoryProducer {

    AbstractFactory thisFactory;

    public FactoryProducer(AbstractFactory _factory){
        this.thisFactory = _factory;
    }

    public AbstractFactory getFactory(){
        return this.thisFactory;
    }
}
