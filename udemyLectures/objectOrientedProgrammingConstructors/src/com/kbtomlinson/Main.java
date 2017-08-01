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


        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters wtih default values
        // 2nd constructor should pass on the 2 values it recieves and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works

        VipCustomer keithVip = new VipCustomer();
        VipCustomer connarVip = new VipCustomer("Connar", "connar@gmail.com");
        VipCustomer seanVip = new VipCustomer("Sean", 45_000, "me@seanlconley.com");

        System.out.println(keithVip.getName() + connarVip.getCreditLimit() + seanVip.getCreditLimit());

    }
}
