package com.zyb.abstractfactory.dao;

public class Green implements IColor {
    @Override
    public void fill() {
        System.out.println("fill green color...");
    }
}
