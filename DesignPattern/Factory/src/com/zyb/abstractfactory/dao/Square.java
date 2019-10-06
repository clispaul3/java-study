package com.zyb.abstractfactory.dao;

public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("draw square shape...");
    }
}
