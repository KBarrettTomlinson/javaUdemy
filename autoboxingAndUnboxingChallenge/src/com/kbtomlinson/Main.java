package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// Autoboxing and Unboxing Challenge

        // Create simple banking application

        // Bank Class
            // HAS
            // arraylist of Branches
            // CAN
            // add a branch
            // add a customer to a branch with initial transaction
            // add a transaction for existing customer at a specific branch
            // show a list of customers for particular branch and list their transactions

                // Branch
                    // HAS
                    // arraylist of customers
                    // CAN
                    // add customer with an initial transaction
                    // add transaction to a customer


                        // Customer
                            // HAS
                            // Name
                            // arraylist of doubles transactions
                            // CAN
                            // add transaction

        Branch newBranch = new Branch("South Minneapolis");
        newBranch.addCustomerToBranch("Keith", 500);
        newBranch.listCustomers();
        newBranch.addTransactionToCustomer("Keith", -23);
        newBranch.listTransactionsForCustomer("Keith");







    }
}
