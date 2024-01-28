package chapter4.abstract_factory.pizzas;

import chapter4.abstract_factory.store.ingredientstore.PizzaIngredientFactory;

/**
 * The type Clam pizza.
 */
public class ClamPizza extends AbstractPizza {

    /**
     * The ingredient factory
     */
    private PizzaIngredientFactory ingredientFactory;

    /**
     * Instantiates a new Clam pizza.
     *
     * @param ingredientFactory the ingredient factory
     */
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = PizzasEnum.CLAM.name();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + this.name);
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
        this.cheese = this.ingredientFactory.createCheese();
        this.clam = this.ingredientFactory.createClam();
    }
}
