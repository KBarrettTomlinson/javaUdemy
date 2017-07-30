package com.kbtomlinson;

public class Printer {
    private int numPagesPrinted;
    private boolean duplex;
    private boolean duplexOn;
    private TonerCartridge tonerCartridge;

    public Printer(boolean duplex, TonerCartridge tonerCartridge) {
        this.numPagesPrinted = 0;
        this.duplex = duplex;
        this.duplexOn = false;
        this.tonerCartridge = tonerCartridge;
    }


    // methods
    public void checkTonerLevel(){
        System.out.println("The current toner level is: " + tonerCartridge.getTonerLevel());
    }

    public void changeToner(int newCartridge){
        checkTonerLevel();
        tonerCartridge.removeTonerCartridge();
        System.out.println("please insert new toner cartridge");
        tonerCartridge.addTonerCartridge(newCartridge);

    }

    public void printJob(int pages){
        int pagesToPrint;

        checkTonerLevel();

        if (duplexOn){
            pagesToPrint = (pages / 2) + (pages % 2);
        } else {
            pagesToPrint = pages;
        }
        for (int i = 0; i < pagesToPrint; i++){
            printPage();
        }

    }

    private void printPage(){
        if (tonerCartridge.getTonerLevel() <= 2){
            System.out.println("toner level is too low, changing toner");
            changeToner(100);
        }
        System.out.println("You've printed one page");
        if (duplexOn) {
            tonerCartridge.decreaseTonerLevel(2);
        }
        else {
            tonerCartridge.decreaseTonerLevel(1);
        }
        this.numPagesPrinted += 1;
    }

    //getters
    public int getNumPagesPrinted() {
        System.out.println("number of pages printed over the life of the printer: " + this.numPagesPrinted);
        return numPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public boolean isDuplexOn() {
        return duplexOn;
    }

    // setters
    public void setDuplexOn(boolean duplexOn) {
        this.duplexOn = duplexOn;
    }
}
