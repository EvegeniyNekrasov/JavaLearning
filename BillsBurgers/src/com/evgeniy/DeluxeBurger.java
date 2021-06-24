package com.evgeniy;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe Machine", "Mega Meat", 19.10, "Mega Bread");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can't add items to the deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can't add items to the deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can't add items to the deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can't add items to the deluxe burger");
    }
}
