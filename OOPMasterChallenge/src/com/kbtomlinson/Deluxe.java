package com.kbtomlinson;

public class Deluxe extends Hamburger {
    private String type;
    private double totalPrice;
    private Addition chips;
    private Addition drink;

    public Deluxe(Addition addition1, Addition addition2, Addition addition3, Addition addition4) {
        super(addition1, addition2, addition3, addition4);
        this.chips = new Addition("chips", .99);
        this.drink = new Addition("drink", 1.99);
        this.type = "Deluxe";
        this.totalPrice =  getBurgerPrice() + chips.getPrice() + drink.getPrice();
    }

    @Override
    public void printOrder() {
        super.printOrder();
        System.out.println("It also comes with chips and a drink");
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getTotalPrice() {
        return totalPrice;
    }
}
