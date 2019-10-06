package com.zyb.builder;

public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasis() {
        System.out.println("build basis for common house");
    }

    @Override
    public void buildWall() {
        System.out.println("build wall for common house");
    }

    @Override
    public void roofed() {
        System.out.println("build roofed for common house");
    }
}
