package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // primitive data types

        // WHOLE NUMBER DATA TYPES

        // int has a width of 32
        // int min and max values
        // int is chosen by default
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue/2);

        // literal is a fixed number as opposed to an expression
        // underscores can be used to make it more readable
        int myLiteralNumber = 2_147_483_647;

        // byte has a width of 8
        // byte data type can be stored between -128 +127
        // bytes are more efficient and take only about 1/4 of the space for operations
        byte myByteValue = 10;
        // below will throw an error because "2" will be evaluated as an int
        // byte myNewByte = myByteValue/2;
        // in order to solve this problem we "cast" the operation
        byte myNewByte = (byte) (myByteValue/2);


        // short has a width of 16
        // short data type can be stored between -32768 +32767
        short myShortValue = 20000;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println(myNewShortValue);

        // long has a width of 64
        // long data type can be stored between 2^63
        // an "L" is put at the end of the number
        long myLongValue = 100L;

        // 1. Create a byte variable and set it to any valid byte number.
        byte byteNumber1 = 25;

        // 2. Create a short variable and set it to any valid short number.
        short shortNumber2 =  17000;

        // 3. Create an int variable and set it to any valid int number.
        int intNumber3 = 5_678_923;

        // 4. Create a variable of type long, and make it equal to 50000 + 10 times the sum of the byte, plus the short
        //    plus the int.
        // Byte and Short will be automatically converted to int and then long's will accept an int.
        // Casting is not required
        long longNumber4 = (50000L + (10L * (byteNumber1 + shortNumber2 + intNumber3)));
        System.out.println(longNumber4);

    }
}
