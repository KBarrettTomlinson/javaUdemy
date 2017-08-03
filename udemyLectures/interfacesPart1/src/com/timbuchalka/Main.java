package com.timbuchalka;

public class Main {

    // interface provides a common behaviour to standardize how a particular set of classes can use
    // once a public method has been made, the interface is a commitment that they won't change


    public static void main(String[] args) {
        ITelephone timsPhone; // <- Tim's phone adheres to ITelephone interface.
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

    }
}
