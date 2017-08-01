package com.kbtomlinson;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //list customers
    public boolean listCustomers(){
        if (customers.size() > 0) {
            System.out.println("List of customers for branch:\n" + this.name + "\n----------");
            for (int i = 0; i < customers.size(); i++) {
                System.out.println("Name: " + customers.get(i).getName());
            }
            System.out.println("----------");
            return true;
        }
        System.out.println("There does not appear to be any customers.");
        return false;
    }

    //add a new customer with an initial deposit
    public boolean addCustomerToBranch(String customer, double deposit){
        if(customers.contains(customer)) {
            System.out.println("This customer already exists.");
            return false;
        } else {
            Customer newCustomer  = new Customer(customer, deposit);
            customers.add(newCustomer);
        }
        return true;
    }

    //add a transaction to a specific customer
    public boolean addTransactionToCustomer(String customer, double transaction){
        if(findCustomer(customer) >= 0){
            this.customers.get(findCustomer(customer)).addTransaction(transaction);
            return true;
        } else {
            System.out.println("This customer doesn't appear to exist.");
            return false;
        }
    }

    //list specific customers transactions
    public boolean listTransactionsForCustomer(String customer){
        if(findCustomer(customer) >= 0){
            this.customers.get(findCustomer(customer)).listTransactions();
            return true;
        } else {
            System.out.println("This customer doesn't appear to exist.");
            return false;
        }
    }


    private int findCustomer(String customerName){
        for(int i = 0; i < this.customers.size(); i++){
            Customer customer = this.customers.get(i);
            if(customer.getName().equals(customerName)){
                return i;
            }
        }
        return -1;
    }

}
