package com.zyb.factory;

import com.zyb.dao.Computer;

/**
 * 静态工厂:通过静态方法创建产品对象
 */
public class ComputerStaticFactory {
    public static Computer create(String brand,Float price){
        Computer computer = new Computer();
        computer.setDisplay("ios");
        computer.setOS("win10");
        computer.setKeyboard("青轴");
        computer.setMouse("双飞燕");
        computer.setBrand(brand);
        computer.setPrice(price);
        return computer;
    }
}
