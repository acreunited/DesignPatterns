package chapter4.abstract_factory;

import chapter4.abstract_factory.pizzas.PizzasEnum;
import chapter4.abstract_factory.store.pizzastore.AbstractPizzaStore;
import chapter4.abstract_factory.store.pizzastore.NYStylePizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        AbstractPizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza(PizzasEnum.CHEESE);
    }
}
