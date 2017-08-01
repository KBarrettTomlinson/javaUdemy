package com.kbtomlinson;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

//        System.out.println("Enter 10 Integers:");
//        getInput();
//        printArray(baseData);
//        resizeArray();
//        System.out.println("Enter 12 Integers:");
//        getInput();
//        printArray(baseData);

        // LISTS and ARRAY LIST
        // A resizable array
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t0 - To print choice options.");
        System.out.println("\t1 - To print the list of grocery items.");
        System.out.println("\t2 - To add an item to the list.");
        System.out.println("\t3 - To modify an item in the list.");
        System.out.println("\t4 - To remove an item from the list.");
        System.out.println("\t5 - To search for an item in the list.");
        System.out.println("\t6 - To quit the application");
    }

    public static void addItem(){
        System.out.print("Please Enter the Grocery Item: ");
        groceryList.addGroceryItem(s.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Please Enter the Item: ");
        String currentItem = s.nextLine();
        System.out.println("Please Enter the Replacement Item: ");
        String newItem = s.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeItem(){
        System.out.print("Please Enter the Item to Remove: ");
//        int itemNumber = s.nextInt();
        String item = s.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem(){
        System.out.println("Please Enter Item to Searh For: ");
        String searchItem = s.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list.");
        }
        else{
            System.out.println(searchItem + " is not in our grocery list.");
        }
    }


    private static void getInput(){
        for(int i = 0; i < baseData.length; i++){
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray(){
        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i < original.length; i++){
            baseData[i] = original[i];
        }
    }

    private static void processArrayList(){
        // copies an array
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        // convert to an array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);


        System.out.println(newArray);
        System.out.println(nextArray);
        System.out.println(myArray);

    }






}
