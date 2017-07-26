package com.kbtomlinson;

public class VipCustomer {
    // parameters
    private String name;
    private Double creditLimit;
    private String email;

    // constructors

    // empty constructor default values for all three
    public VipCustomer(){
        this("N/A", 200.00, "N/A");
    }

    // default value for account limit
    public VipCustomer(String name, String email){
        this(name, 200.00, email);
    }

    // construct all three
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public Double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
