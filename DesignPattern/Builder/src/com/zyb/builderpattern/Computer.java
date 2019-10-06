package com.zyb.builderpattern;

public class Computer {
    private String host;
    private String display;
    private String mouse;
    public Computer(){}

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "host='" + host + '\'' +
                ", display='" + display + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }
}
