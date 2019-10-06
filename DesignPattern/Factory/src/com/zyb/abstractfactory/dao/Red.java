package com.zyb.abstractfactory.dao;

public class Red implements IColor {
    @Override
    public void fill() {
        System.out.println("fill red color");
    }
}
