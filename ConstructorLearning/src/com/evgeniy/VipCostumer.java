package com.evgeniy;

public class VipCostumer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCostumer() {
        this("Default Name", 50000.0, "default@email.com");
    }

    public VipCostumer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCostumer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


}
