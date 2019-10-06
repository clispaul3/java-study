package com.zyb.pattern;
/**
 * 懒汉式，线程安全，synchronized属于重量级锁，效率较低
 * 不可使用
 */
public class SinglePattern03 {
    private static SinglePattern03 instance;
    private SinglePattern03(){}
    public static synchronized SinglePattern03 getInstance(){
        if(instance == null){
            instance = new SinglePattern03();
        }
        return instance;
    }
}
