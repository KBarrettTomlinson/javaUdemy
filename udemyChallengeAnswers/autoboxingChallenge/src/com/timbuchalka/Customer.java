package com.timbuchalka;

import java.util.ArrayList;

/**
 * Created by dev on 4/09/15.
 */

// Start from the bottom rung of the ladder

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>(); // <-- ArrayList Constructor
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
