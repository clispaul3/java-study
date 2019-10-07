package com.zyb.factory;

import com.zyb.dao.Computer;

/**
 * 实例工厂：先创建工厂对象，再生产产品对象
 */
public class ComputerInstanceFactory {

    public Computer create(String brand, Float price){
        Computer computer = new Computer();
        computer.setDisplay("lanmei");
        computer.setOS("win10");
        computer.setKeyboard("青轴");
        computer.setMouse("双飞燕");
        computer.setBrand(brand);
        computer.setPrice(price);
        return computer;
    }
}
