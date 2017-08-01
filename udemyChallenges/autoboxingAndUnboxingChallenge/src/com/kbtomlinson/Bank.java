package com.kbtomlinson;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //list Branches

    //add a Branch

    //add a customer to a branch with an inital deposit

    //add a transaction to a customer at a specific branch

    //list branches with customer lists

    //list transactions of a specific customer at a specific branch
}
