package com.zyb.pattern;

/**
 * 懒汉式单例模式，线程不安全，不可取
 */
public class SinglePattern02 {
    private static SinglePattern02 instance;
    private SinglePattern02(){}
    public static SinglePattern02 getInstance(){
        if(instance == null){
            instance = new SinglePattern02();
        }
        return instance;
    }
}
