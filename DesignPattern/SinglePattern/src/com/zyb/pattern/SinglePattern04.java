package com.zyb.pattern;

/**
 * 静态内部类不会在外部类加载的时候加载
 * 类在加载进内存的时候是线程安全的
 * 类加载的时候会构造类的静态属性
 * 推荐使用
 */
public class SinglePattern04 {
    private static class SingletonInstance{
        private static final SinglePattern04 instance = new SinglePattern04();
    }
    public static SinglePattern04 getInstance(){
        return SingletonInstance.instance;
    }
}
