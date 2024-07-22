package chapter8.beverage;

/**
 * Class to prepare Caffeine Drinks
 */
public abstract class CaffeineBeverage {

    /**
     * Instantiates a new Caffeine beverage.
     */
    protected CaffeineBeverage() {
        // empty
    }

    /**
     * Prepares the recipe
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * Brew.
     */
    public abstract void brew();

    /**
     * Add condiments.
     */
    public abstract void addCondiments();

    /**
     * Boil water.
     */
    private void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * Pour in cup.
     */
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
