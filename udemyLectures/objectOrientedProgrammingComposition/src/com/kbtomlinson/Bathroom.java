package com.kbtomlinson;

public class Bathroom {
    private Sink theSink;
    private Shower theShower;

    public Bathroom(Sink theSink, Shower theShower) {
        this.theSink = theSink;
        this.theShower = theShower;
    }

    public void cleanBathroom(){
        theShower.clean();
        theSink.clean();
    }

    public Sink getTheSink() {
        return theSink;
    }

    public Shower getTheShower() {
        return theShower;
    }
}
