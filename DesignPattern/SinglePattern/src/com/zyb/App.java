package com.zyb;
import com.zyb.pattern.SinglePattern01;
import com.zyb.pattern.SinglePattern06;

public class App {
    public static void main(String[] args) {
        App.test2();
    }
    private static void test1(){
        SinglePattern01 instance = SinglePattern01.getInstance();
        SinglePattern01 instance2 = SinglePattern01.getInstance();
        System.out.println(instance2.hashCode());
        System.out.println(instance.hashCode());
    }
    private static void test2(){
        SinglePattern06.INSTANCE.show();
    }
}
