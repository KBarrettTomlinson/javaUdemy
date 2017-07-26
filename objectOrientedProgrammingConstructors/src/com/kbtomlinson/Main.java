package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// CONSTRUCTORS

        // constructors are used when creating a new object from a class in order to initialize the object

        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.

        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.

        // You will want to create various code in the Main class to confirm your code is working.

        // Add some System.out.prinln's in the two methods above as well.

        BankAccount tomlinsonChecking = new BankAccount(4567, 15.00,
                "Keith Tomlinson", "kbarretttomlinson@gmail.com", "6513997345");
        tomlinsonChecking.setAccountNumber(4567);
        tomlinsonChecking.setBalance(0.00);
        tomlinsonChecking.depositFunds(450.00);

        tomlinsonChecking.getBalance();
        tomlinsonChecking.withdrawalFunds(35.00);
        tomlinsonChecking.getBalance();
        tomlinsonChecking.withdrawalFunds(700);
        tomlinsonChecking.getFirstAndLastName();


    }
}
