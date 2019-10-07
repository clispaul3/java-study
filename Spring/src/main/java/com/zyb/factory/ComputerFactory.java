package com.zyb.factory;

import com.zyb.dao.Computer;
import org.springframework.beans.factory.FactoryBean;

/**
 * spring自带的工厂接口
 * 不管创建的对象是否是单例，都是懒汉式创建
 */
public class ComputerFactory implements FactoryBean<Computer> {
    public Computer getObject() throws Exception {
        Computer computer = new Computer();
        computer.setDisplay("spring");
        computer.setOS("win10");
        computer.setKeyboard("青轴");
        computer.setMouse("双飞燕");
        return computer;
    }

    public Class<?> getObjectType() {
        return Computer.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
