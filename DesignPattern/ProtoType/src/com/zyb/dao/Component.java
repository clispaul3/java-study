package com.zyb.dao;

import java.io.Serializable;

public class Component implements Serializable {
    private String cname;
    private Component parent;
    public Component(String cname){
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Component{" +
                "cname='" + cname + '\'' +
                ", parent=" + parent.hashCode() +
                '}';
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }
}
