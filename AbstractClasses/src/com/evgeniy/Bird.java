package com.evgeniy;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is peacking");
    }

    @Override
    public void breathe() {
        System.out.println("Breading");
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
