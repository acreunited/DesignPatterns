package chapter4.franchise.store;

import chapter4.franchise.pizzas.Pizza;
import chapter4.franchise.pizzas.PizzasEnum;
import chapter4.franchise.pizzas.chicago.ChicagoStyleCheesePizza;
import chapter4.franchise.pizzas.chicago.ChicagoStyleClaimPizza;
import chapter4.franchise.pizzas.chicago.ChicagoStylePepperoniPizza;
import chapter4.franchise.pizzas.chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends AbstractPizzaStore {

    @Override
    public Pizza createPizza(PizzasEnum pizzaType) {
        return switch (pizzaType) {
            case CHEESE -> new ChicagoStyleCheesePizza();
            case PEPPERONI -> new ChicagoStylePepperoniPizza();
            case CLAM -> new ChicagoStyleClaimPizza();
            case VEGGIE -> new ChicagoStyleVeggiePizza();
            default -> throw new IllegalArgumentException("This Pizza does not exist");
        };
    }
}
