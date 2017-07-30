package com.kbtomlinson;

// This is an example of a non-encapuslated Clasee
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0){
            System.out.println("Player Knocked Out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
