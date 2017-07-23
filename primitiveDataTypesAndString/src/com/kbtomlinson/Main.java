package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 8 Primitive Data Types - defined by Java and reserved by a special keyword
        // byte
        // short
        // int - DEFAULT
        // long
        // float
        // double - DEFAULT
        // char
        // boolean

        // 9 Data Type but is not actually Primitive
        // STRING
        // A string is a sequence of characters
        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        System.out.println(("concatonate is similar to javascript " + myString));


        // Concatenate is calculated the same as in JavaScript
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        numberString = numberString + 49.95;
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

    }
}
