package chapter3.beverages;

import chapter3.beverages.decorators.Mocha;
import chapter3.beverages.decorators.Soy;
import chapter3.beverages.decorators.Whip;
import chapter3.beverages.drinks.AbstractBeverage;
import chapter3.beverages.drinks.Espresso;
import chapter3.beverages.drinks.HouseBlend;

/**
 * To run out Beverage project
 */
public final class StarbuzzCoffee {

    /**
     * Private empty Constructor
     */
    private StarbuzzCoffee() {
        // empty
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        AbstractBeverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        AbstractBeverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
