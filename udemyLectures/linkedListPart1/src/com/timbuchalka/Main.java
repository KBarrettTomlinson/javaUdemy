package com.timbuchalka;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //instantiate a customer
	    Customer customer = new Customer("Tim", 54.96);

        Customer anotherCustomer;

        // setting this customer equal to previous customer
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);

        // because anotherCustomer is pointing to the same place in memory of customer and not creating a copy of customer
        // changing the balance of anotherCustomer changes the balance of customer
        //customer.setBalance(55.43);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());



        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);


        for(int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }

        intList.add(1, 2); //<--- adds at index 1, but pushes everything down. Does not overwrite
        // when you start dealing with large numbers of records this is a memory problem
        for(int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }

        //Linked lists
        // alternative to arrays
        // stores the actual link to the next item in the list as well as the data
        // So when we change our array, we are actually changing the pointers and not the actual memory storage
        // Sydney --> Melbourne --> Brisbane --> Perth
        // Sydney --> Alice Springs --> Melbourne --> Brisbane --> Perth
        // No memory needs to be shifted around just what is pointing to eachother.
        // Removing works the same just make Alice Springs point to Brisbane in order to delete Melbourne
        // Garbage collection finds things which are not being pointed at

    }
}
