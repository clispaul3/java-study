package com.zyb;

import com.zyb.builder.AbstractHouse;
import com.zyb.builder.CommonHouse;
import com.zyb.builder.HighHouse;
import com.zyb.builderpattern.Computer;
import com.zyb.builderpattern.Director;

public class App {
    public static void main(String[] args) {
        System.out.println("builder pattern...");
//        test1();
        Computer computer = Director.build();
        System.out.println(computer.toString());
    }
    public static void test1(){
        AbstractHouse house1 = new CommonHouse();
        house1.build();
        System.out.println();
        AbstractHouse house2 = new HighHouse();
        house2.build();
    }

}
