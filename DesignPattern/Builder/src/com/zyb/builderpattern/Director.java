package com.zyb.builderpattern;
// 负责控制产品的生成过程
public class Director {
    public static Computer build(){
        HPBuilder hpBuilder = new HPBuilder();
        hpBuilder.buildHost();
        hpBuilder.buildDisplay();
        hpBuilder.buildMouse();
        return hpBuilder.getComputer();
    }
}
