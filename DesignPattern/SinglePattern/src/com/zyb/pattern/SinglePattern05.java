package com.zyb.pattern;

/**
 * 双重检查，线程安全，懒加载
 * 推荐使用
 */
public class SinglePattern05 {
    private static volatile SinglePattern05 instance;
    private SinglePattern05(){}
    public static SinglePattern05 getInstance(){
        if(instance == null){
            synchronized(SinglePattern05.class){
                if(instance == null){
                    instance = new SinglePattern05();
                }
            }
        }
        return instance;
    }
}
