package com.timbuchalka;

/**
 * Created by dev on 27/09/15.
 */

// convention says you use I <-- at the beginning of the name so that it is clearly an interface
// defining the contract


public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
