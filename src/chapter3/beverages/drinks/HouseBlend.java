package chapter3.beverages.drinks;

/**
 * The HouseBlend beverage
 */
public class HouseBlend extends AbstractBeverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
