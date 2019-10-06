package com.zyb.factory;

import com.zyb.abstractfactory.AbstractFactory;
import com.zyb.abstractfactory.dao.IShape;
import com.zyb.factory.pizza.Pizza;
import com.zyb.fnfactory.CheesePizzaFactory;
import com.zyb.fnfactory.GeekPizzaFactory;
import com.zyb.fnfactory.IFnfactory;

import java.util.Map;

public class App {
    public static void main(String[] args) {
//        fnFactoryTest();
        abstractFactoryTest();
    }
    public static void simpleFactoryTest(){
        Pizza pizza = SimpleFactory.createPizza(2);
        pizza.prepare();
    }
    public static void fnFactoryTest(){
        IFnfactory geekFactory = new GeekPizzaFactory();
        IFnfactory cheeseFactory = new CheesePizzaFactory();
        Pizza geekPizza = geekFactory.create();
        Pizza cheesePizza = cheeseFactory.create();
        geekPizza.prepare();
        cheesePizza.prepare();
    }
    public static void abstractFactoryTest(){
        AbstractFactory factory = new AbstractFactory();
        Map result =  factory.create("circle","red");
        IShape shape = (IShape) result.get("shape");
        shape.draw();
    }
}
