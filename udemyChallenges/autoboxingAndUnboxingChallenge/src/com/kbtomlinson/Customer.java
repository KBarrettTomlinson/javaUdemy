package com.kbtomlinson;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    // Constructor
    public Customer(String name, double initialDeposit) {
        if(initialDeposit > 0) {
            this.name = name;
            addTransaction(initialDeposit);
            System.out.println("A new customer was created.");
        }
        else{
            System.out.println("You need to submit a deposit in order to become a customer.");
        }
    }

    // Getter
    public String getName() {
        return name;
    }

    // Add Transaction
    public boolean addTransaction(double value){
        if (this.getName() != null){
            transactions.add(value);
            return true;
        }
        System.out.println("This customer does not appear to exist.");
        return false;
    }

    // List Transactions
    public boolean listTransactions(){
        if (this.getName() != null) {
            System.out.println("List of transactions for customer:\n" + this.name + "\n----------");
            for (int i = 0; i < transactions.size(); i++) {
                System.out.println("Transaction in the amount of: " + transactions.get(i));
            }
            System.out.println("----------");
            return true;
        }
        System.out.println("This customer does not appear to exist.");
        return false;
    }
}
