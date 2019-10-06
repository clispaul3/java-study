package com.zyb.builder;

public abstract class AbstractHouse {
    public abstract void buildBasis();
    public abstract void buildWall();
    public abstract void roofed();
    public void build(){
        this.buildBasis();
        this.buildWall();
        this.roofed();
    }
}
