package com.burger;

public abstract class Burger {

    final private String name;
    final private String meat;
    final private double price;
    final private eBreadRollType breadRollType;

    final private eDrink drink;
    final private eChips chips;

    public Burger(String name, String meat, double price, eBreadRollType breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.drink = eDrink.NONE;
        this.chips = eChips.NONE;
    }

    public Burger(String name, String meat, double price, eBreadRollType breadRollType, eDrink drink, eChips chips) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.drink = drink;
        this.chips = chips;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public eBreadRollType getBreadRollType() {
        return breadRollType;
    }

    public abstract void itemizeBurger();

    public String getFundamentalsString() {

        StringBuilder builder = new StringBuilder();

        builder.append("Name: " + getName() + "\n");
        builder.append("Meat: " + getMeat() + "\n");
        builder.append("BreadRollType: " + getBreadRollType().getName() + "\n");

        return builder.toString();
    }
}
