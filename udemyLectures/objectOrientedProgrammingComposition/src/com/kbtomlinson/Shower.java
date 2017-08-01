package com.kbtomlinson;

public class Shower {
    private boolean isOn;
    private String name;

    public Shower(boolean isOn, String name) {
        this.isOn = isOn;
        this.name = name;
    }

    public void clean(){
        System.out.println("the shower is now sparkling clean");
    }

    public boolean isOn() {
        return isOn;
    }

    public String getName() {
        return name;
    }
}
