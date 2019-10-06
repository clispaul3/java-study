package com.zyb.builderpattern;
// 抽象建造者
public interface Builder {
    void buildHost();
    void buildDisplay();
    void buildMouse();
    Computer getComputer();
}
