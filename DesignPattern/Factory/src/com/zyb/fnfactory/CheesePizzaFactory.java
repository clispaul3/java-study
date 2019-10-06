package com.zyb.fnfactory;

import com.zyb.factory.pizza.CheesePizza;
import com.zyb.factory.pizza.Pizza;

public class CheesePizzaFactory implements IFnfactory{
    public Pizza create(){
        Pizza pizza = new CheesePizza();
        return pizza;
    }
}
