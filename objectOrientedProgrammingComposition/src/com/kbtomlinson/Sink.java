package com.kbtomlinson;

public class Sink {
    private boolean isOn;
    private String name;

    public Sink(boolean isOn, String name) {
        this.isOn = isOn;
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff(){
        isOn = false;
    }

    public void turnOn(){
        isOn = true;
    }

    public void clean(){
        System.out.println("The sink is now sparkling clean");
    }

    public String getName() {
        return name;
    }
}
