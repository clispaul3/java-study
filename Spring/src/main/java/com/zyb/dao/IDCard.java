package com.zyb.dao;

public class IDCard {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "id='" + id + '\'' +
                '}';
    }
}
