package chapter4.abstract_factory.pizzas;

import chapter4.abstract_factory.store.ingredientstore.PizzaIngredientFactory;

/**
 * The type Cheese pizza.
 */
public class CheesePizza extends AbstractPizza {

    /**
     * The ingredient Factory
     */
    private final PizzaIngredientFactory ingredientFactory;

    /**
     * Instantiates a new Cheese pizza.
     *
     * @param ingredientFactory the ingredient factory
     */
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = PizzasEnum.CHEESE.name();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + this.name);
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
        this.cheese = this.ingredientFactory.createCheese();
    }
}
