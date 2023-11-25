package com.burger;

public enum eExtraIngredient {
    TOMATO(0.27),
    LETTUCE(0.75),
    EGG(5.43),
    LENTILS(3.41),
    CHEESE(1.13);

    final private double price;

    eExtraIngredient(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
