package com.kbtomlinson;

public class TonerCartridge {
    private int tonerLevel;

    public TonerCartridge(int tonerLevel) {
        setTonerLevel(tonerLevel);
    }

    public void removeTonerCartridge(){
        System.out.println("You've removed the existing tonerCartridge, setting toner level to 0");
        this.tonerLevel = 0;
    }

    public void addTonerCartridge(int newCartridge){
        System.out.println("You are adding a new cartridge");
        setTonerLevel(newCartridge);
    }

    public void decreaseTonerLevel(int incriment){
        System.out.println("you are decreaseing the toner by: " + incriment);
        this.tonerLevel -= incriment;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("The toner your are trying to add is incompatible.");
        }
    }
}
