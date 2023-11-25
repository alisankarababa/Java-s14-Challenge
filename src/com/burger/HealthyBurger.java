package com.burger;

public class HealthyBurger extends Burger implements IExtraIngredientAddible{

    private eExtraIngredient[] extraIngredients;
    private int idxNextExtraIngredient;
    final static private int maxCntIngredient = 4;

    public HealthyBurger(String name, String meat, double price, eBreadRollType breadRollType) {
        super(name, meat, price, breadRollType);
        extraIngredients = new eExtraIngredient[maxCntIngredient];
        idxNextExtraIngredient = 0;
    }
    @Override
    public void itemizeBurger() {

        StringBuilder builder = new StringBuilder();

        builder.append(getFundamentalsString());

        double totalCharge = getPrice();

        for(int i = 0; i < idxNextExtraIngredient; ++i) {
            builder.append("Addition" + (i + 1) + ": " + extraIngredients[i] + "\n");
            totalCharge += extraIngredients[i].getPrice();
        }

        builder.append("Price: " + totalCharge);

        System.out.println(builder);
    }

    public void addIngredient(eExtraIngredient extraIngredient) {

        if(idxNextExtraIngredient == maxCntIngredient) {
            System.out.printf("You cannot add more than %d ingredients\n", maxCntIngredient);
            return;
        }
        extraIngredients[idxNextExtraIngredient++] = extraIngredient;
    }
}
