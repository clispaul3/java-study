package com.zyb.pattern;

/**
 * 枚举方式实现，即可实现懒加载，又是线程安全
 * 强烈推荐
 */
public enum SinglePattern06 {
    INSTANCE;
    public void show(){
        System.out.println("show");
    }
}
