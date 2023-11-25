import com.burger.*;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Normal", 3.56, eBreadRollType.WRAP);

        hamburger.addIngredient(eExtraIngredient.TOMATO);
        hamburger.addIngredient(eExtraIngredient.CHEESE);
        hamburger.addIngredient(eExtraIngredient.LETTUCE);

        hamburger.itemizeBurger();

        DeluxeBurger db = new DeluxeBurger("Deluxe Burger", "Double", eBreadRollType.DOUBLE_SANDWICH);

        db.addIngredient(eExtraIngredient.TOMATO);

        db.itemizeBurger();
        HealthyBurger hb = new HealthyBurger("Vegan Burger", "Tofu", 5.67, eBreadRollType.SANDWICH);

        hb.addIngredient(eExtraIngredient.EGG);
        hb.addIngredient(eExtraIngredient.LENTILS);

        hb.itemizeBurger();


    }
}