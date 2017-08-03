package com.timbuchalka;

import com.timbuchalka.ITelephone;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    // Can use control + n to pull up menu and choose Implements.
    // This will pull up all of the Interfaces required


    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    // all methods of the interface must be included even if they are not valid.
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");

    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            isRinging = false;
            System.out.println("Mobile Phone not on or number different");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
