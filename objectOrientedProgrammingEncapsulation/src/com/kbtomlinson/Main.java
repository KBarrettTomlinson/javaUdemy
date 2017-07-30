package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// ENCAPSULATION

        // protecting internal properties to from other classes to protect the integrity of the object

        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " +player.healthRemaining());

        // Because Player has not been encapsulated we cannot control the change of variables
        player.health = 700;
        // Additionally any changes made to a class will cause major changes to be needed outside the Class
        // This essentially is violating DRY

        // Finally, you could forget to initialize the Classes parameters

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " +player.healthRemaining());

        EnhancedPlayer eplayer = new EnhancedPlayer("Tim",50, "Sword");
        eplayer.getHealth();
    }
}
