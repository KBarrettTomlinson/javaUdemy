package com.timbuchalka;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by dev on 16/09/15.
 */
public class Demo {
    // psvm <-- intelli J shortcut
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        addInOrder(placesToVisit, "Houston");
        printList(placesToVisit);
        visit(placesToVisit);

        //methods related to Linked Lists
        //.add() <-- this requires an index
        //.remove() <-- this requires an index

//        String string1 = "Brisbane";
//        int compareToValue = string1.compareTo("zanaberra");
//        System.out.println("Compare To Value:" + compareToValue);

    }


    private static void printList(LinkedList<String> linkedList) {
        // Iterator is a java utility
        // Accepting a linked list as a parameter
        // Iterator similar to using a for loop, but .iterator() is a method that comes with the linkedList class
        // .hasNext method comes with linked list
        Iterator<String> i= linkedList.iterator();
        // while this current thing is pointing to something... keep going.
        while(i.hasNext()) {
            //i.next() shows current value then moves on.
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }



    //method that inserts new entry in alphabetical order
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        // List Iterator is a  java utility
        ListIterator<String> stringListIterator = linkedList.listIterator(); // just creating a list iterator .next must be used to move to the first entry.

        while(stringListIterator.hasNext()) { // <-- going through all of the records is a method in the List Iterator class
            int comparison = stringListIterator.next().compareTo(newCity); // <-- compare to is a method returns 0 if it exists
            // remember that .next returns the value, but then moves on to the next record
            if(comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false; // <--- wasn't successful
            } else if(comparison > 0) { // <--- compare
                // new City should appear before this one
                // Brisbane  -> Adelaide
                stringListIterator.previous(); //<--- because we already used .next which moved us forward
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) { //<-- don't need to do anything.
                // move on next city
            }
        }

        stringListIterator.add(newCity); // <--- puts the new city at the end of the list because we've compared it to everything
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) { // <-- checking if the linkedList is Empty
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;

                case 1:
                    // if you previously were going backwards, then you have to change direction and move before going again
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    // if you previous were going forward, then you have to change direction and move before going again
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;

            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }


























}
