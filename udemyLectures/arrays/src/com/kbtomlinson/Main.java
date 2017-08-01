package com.kbtomlinson;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // ARRAYS
        // a data structure which allows you to store a sequence of values, all of the same type.

        int[] myArray; //<-- standard definition
        myArray = new int[10]; //<--- the number of elements we are assigning to the array.

        int[] anotherArray = new int[10];

        anotherArray[5] = 12; // <-- zero indexed, saving to the 6th element.

        System.out.println(anotherArray[5]);
        System.out.println(anotherArray[4]); // <-- values which are not initialized, have a 0 value

        int[] inLineArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(inLineArray[3]);

        for (int i = 0; i < 10; i++) {
            myArray[i] = i * 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(myArray[i]);
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(anotherArray[i]);
        }

        System.out.println(anotherArray.length);

        printArray(myArray);

        // New section
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static void printArray(int[] array){

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i <  array.length; i++){
            sum += array[i];
        }
        return (double) (sum / array.length);
    }

}
