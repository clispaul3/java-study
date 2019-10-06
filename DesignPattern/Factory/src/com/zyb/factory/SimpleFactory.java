package com.zyb.factory;
import com.zyb.factory.pizza.CheesePizza;
import com.zyb.factory.pizza.GeekPizza;
import com.zyb.factory.pizza.Pizza;

public class SimpleFactory {
    public static final int TYPE_CHEESE = 1;
    public static final int TYPE_GEEK = 2;
    public static Pizza createPizza(int type){
        Pizza pizza = null;
        switch (type){
            case 1:
                pizza = new CheesePizza();
                break;
            case 2:
                pizza = new GeekPizza();
            default:
                break;
        }
        return pizza;
    }
}
