package com.kbtomlinson;

public class Hamburger {
    private String type;
    private double burgerPrice;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
    private double totalPrice;

    public Hamburger(Addition addition1, Addition addition2, Addition addition3, Addition addition4) {
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;

        this.type = "Basic";
        this.burgerPrice = 4.99;
        this.totalPrice = this.burgerPrice + this.addition1.getPrice() + this.addition2.getPrice()
                + this.addition3.getPrice()+ this.addition4.getPrice();
    }

    public void printOrder(){
        System.out.println("You ordered a " + getType() + " Burger" + " with " + addition1.getName() + ", "
                + addition2.getName() + ", " + addition3.getName() + ", and " + addition4.getName() + ".");
    }

    public String getType() {
        return type;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
