package chapter4.franchise.store;

import chapter4.franchise.pizzas.Pizza;
import chapter4.franchise.pizzas.PizzasEnum;
import chapter4.franchise.pizzas.newyork.NYStyleCheesePizza;
import chapter4.franchise.pizzas.newyork.NYStyleClaimPizza;
import chapter4.franchise.pizzas.newyork.NYStylePepperoniPizza;
import chapter4.franchise.pizzas.newyork.NYStyleVeggiePizza;

public class NYStylePizzaStore extends AbstractPizzaStore {

    @Override
    public Pizza createPizza(PizzasEnum pizzaType) {
        return switch (pizzaType) {
            case CHEESE -> new NYStyleCheesePizza();
            case PEPPERONI -> new NYStylePepperoniPizza();
            case CLAM -> new NYStyleClaimPizza();
            case VEGGIE -> new NYStyleVeggiePizza();
            default -> throw new IllegalArgumentException("This Pizza does not exist");
        };
    }
}
