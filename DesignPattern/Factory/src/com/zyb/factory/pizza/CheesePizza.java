package com.zyb.factory.pizza;
import com.zyb.factory.pizza.Pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare for CheesePizza...");
    }
}
