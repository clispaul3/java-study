package com.zyb.builderpattern;
// 具体建造者，负责生成产品的零部件
public class HPBuilder implements Builder {
    private Computer computer = new Computer();
    @Override
    public void buildHost() {
        computer.setHost("HP");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("HP");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("HP");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
