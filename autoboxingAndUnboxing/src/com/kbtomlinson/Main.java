package com.kbtomlinson;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	// AUTOBOXING and UNBOXING

        // define an array
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        // array list
        ArrayList<String> strArrayList = new ArrayList<String>();

        // Cannot however make an int ArrayList
        // ArrayList must be a class, cannot be a primitive type

       // ArrayList<int> intARrayList = new ArrayList<int>(); <- throws an error

        // we could work around this by creating a simple int Class as above

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        intClassArrayList.add(new IntClass(34));

        System.out.println(intClassArrayList.get(1).getMyValue());
        System.out.println("test");

        //AutoBoxing is designed to handle primitive data types

        Integer integer = new Integer(54);
        Double doubleValue = new Double(543);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
            //AUTOBOXING
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {     //UNBOXING
            System.out.println(i + " -->" + intArrayList.get(i).intValue());
        }

        // JAVA MAKES THINGS EASIER
        // Autoboxing
        Integer myIntValue = 56; // Integer.valueOf(56);
        // Unboxing
        int myInt = myIntValue; // myInt.intValue();


        // autoboxing and unboxing the long way with Double
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i = 0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(value);
        }


        // autoboxing and unboxing the short hand way with Double
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            myDoubleValues.add(dbl);
        }

        for(int i = 0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(value);
        }

    }
}
