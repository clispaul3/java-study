package com.zyb.pattern;

/**
 * 饿汉式单例模式，可能会造成内存浪费，可使用
 */
public class SinglePattern01 {
    private static final SinglePattern01 instance;
    static {
        instance = new SinglePattern01();
}
    public static final SinglePattern01 getInstance(){
        return instance;
    }
    private SinglePattern01(){}
}
