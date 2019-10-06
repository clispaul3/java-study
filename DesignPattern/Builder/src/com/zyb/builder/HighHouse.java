package com.zyb.builder;

public class HighHouse extends AbstractHouse {
    @Override
    public void buildBasis() {
        System.out.println("build basis for high house");
    }

    @Override
    public void buildWall() {
        System.out.println("build wall for high house");
    }

    @Override
    public void roofed() {
        System.out.println("build roofed for high house");
    }
}
