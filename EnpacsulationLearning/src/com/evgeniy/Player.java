package com.evgeniy;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void lostHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int helthRemaining() {
        return this.health;
    }
}
