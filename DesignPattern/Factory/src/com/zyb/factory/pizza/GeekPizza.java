package com.zyb.factory.pizza;
import com.zyb.factory.pizza.Pizza;

public class GeekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare form GreekPizza...");
    }
}
