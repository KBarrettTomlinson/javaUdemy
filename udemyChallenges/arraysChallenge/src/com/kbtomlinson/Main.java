package com.kbtomlinson;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// Array Challenge
        // Create a program using arrays that sorts a list of integers in descending order

        // Set up the program so that the number to sort are read in from the keyboard
        // Implement the following methods - getIntegers, printArray, and sortIntegers

        int[] intArray = new int[5];

        intArray = getIntegers(5);
        intArray = sortIntegers(intArray);
        printArray(intArray);

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " non-repeating integer values.\r");

        int[] values = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;

    }

    public static int[] sortIntegers(int[] array){
        System.out.println("Sorting an array.\r");

        int [] sortedArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }


    public static void printArray(int[] array){
        System.out.println("Printing an array.\r");

        for(int i = 0; i < array.length; i++){
            System.out.println("Value: " + array[i] + " At Index: " + i);
        }


    }
}
