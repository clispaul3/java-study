package com.zyb.fnfactory;

import com.zyb.factory.pizza.GeekPizza;
import com.zyb.factory.pizza.Pizza;

public class GeekPizzaFactory implements IFnfactory{
    public Pizza create(){
        Pizza pizza = new GeekPizza();
        return pizza;
    }
}
