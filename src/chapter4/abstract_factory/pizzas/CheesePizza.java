package chapter4.abstract_factory.pizzas;

import chapter4.abstract_factory.store.ingredientstore.PizzaIngredientFactory;

public class CheesePizza extends AbstractPizza {

    private PizzaIngredientFactory ingredientFactory;

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
