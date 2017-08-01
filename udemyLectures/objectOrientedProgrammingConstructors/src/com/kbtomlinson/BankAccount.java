package com.kbtomlinson;

public class BankAccount{

    // properties
    private int accountNumber;
    private double balance;
    private String firstAndLastName;
    private String email;
    private String phoneNumber;

    // constructor
    public BankAccount(){
        //set up default values for an empty constructor call this calls the other constructor
        this(5678, 0.00, "default", "default", "default");
        System.out.println("Empty constructor call");
    }

    public BankAccount(int accountNumber, double balance, String firstAndLastName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.firstAndLastName = firstAndLastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // getters
    public int getAccountNumber(){
        System.out.println("Your current accountNumber is: " + this.accountNumber);
        return this.accountNumber;
    }

    public double getBalance(){
        System.out.println("Your current balance is: " + this.balance);
        return this.balance;
    }

    public String getFirstAndLastName(){
        System.out.println("Your current name is: " + this.firstAndLastName);
        return  this.firstAndLastName;
    }

    public String getEmail(){
        System.out.println(("Your current email is: " + this.email));
        return this.email;
    }

    public String getPhoneNumber(){
        System.out.println("Your current phone number is: " + this.phoneNumber);
        return this.phoneNumber;
    }

    // setters
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setFirstAndLastName(String firstAndLastName){
        this.firstAndLastName = firstAndLastName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    // methods
    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
    }

    public void withdrawalFunds(double withdrawAmount){
        double newBalance = this.balance - withdrawAmount;
        if (newBalance >= 0) {
            this.balance = newBalance;
        } else {
            System.out.println("You have insufficient funds to withdraw $" + withdrawAmount);
        }

    }
}
