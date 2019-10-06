package com.zyb.factory.pizza;

public abstract class Pizza {
    protected String name;
    public abstract void prepare();
    public void bake(){
        System.out.println(this.name + "baking");
    }
    public void cut(){
        System.out.println(this.name + "cutting");
    }
    public void box(){
        System.out.println(this.name + "boxing");
    }
}
