package chapter4.abstract_factory.pizzas;

import chapter4.abstract_factory.store.ingredientstore.PizzaIngredientFactory;

public class ClamPizza extends AbstractPizza {

    private PizzaIngredientFactory ingredientFactory;

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
