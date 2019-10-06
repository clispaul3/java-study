package com.zyb.abstractfactory.dao;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("draw circle shape...");
    }
}
