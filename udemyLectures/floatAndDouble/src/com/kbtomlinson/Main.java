package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // FLOAT AND DOUBLE DATA TYPES
        // Float is single precision
        // Double is double precision

        int myIntValue = 5;


        // float has 7 digits of precision
        // float has a width of 32 (4 bytes)
        float myFloatValue = 5f / 2.15f;

        // double has 16 digits of precision
        // double has a width of 64 (8 bytes)
        double myDoubleValue = 5d / 2.675d;

        // or if you use decimals Java will automatically assume it is a double in the same way that it assumes int

        double myDoubleValue2 = 5.25;

        System.out.println("myIntValue = "+ myIntValue);
        System.out.println("myFloatValue = "+ myFloatValue);
        System.out.println("myDoubleValue = "+ myDoubleValue);
        System.out.println(myDoubleValue2);

        float myConvertToFloat = (float) (myDoubleValue2);

        System.out.println(myConvertToFloat);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        double pounds = 75d;
        // 2. Calculate the number of Kilograms for the number above and store in a variable
        double poundToKiloConversion = 0.45359237d;
        double kilograms = pounds * poundToKiloConversion;
        // 3. Print out the results
        System.out.println("Kilograms" + kilograms);
        //
        // NOTES: 1 pound is equal to 0.45359237

        // literals can use _ to make the numbers more readable with doubles as well
        double pi = 3.141_592_7d;

    }
}
