package com.burger;

public class DeluxeBurger extends Burger implements IExtraIngredientAddible {


    public DeluxeBurger(String name, String meat, eBreadRollType breadRollType) {
        super(name, meat, 19.10, breadRollType, eDrink.COKE, eChips.SMALL);
    }

    @Override
    public void itemizeBurger() {
        StringBuilder builder = new StringBuilder();
        builder.append(getFundamentalsString());
        builder.append("Price: " + getPrice());
        System.out.println(builder);
    }

    @Override
    public void addIngredient(eExtraIngredient extraIngredient) {
        System.out.println("You cannot add extra ingredients to deluxe burger");
    }
}
