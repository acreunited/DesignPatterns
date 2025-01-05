package chapter9.iterator.custom_iterator.menu;

import chapter9.iterator.custom_iterator.MenuItem;
import chapter9.iterator.custom_iterator.iterator.Iterator;
import chapter9.iterator.custom_iterator.iterator.PancakeHouseMenuIterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {

    private final List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(this.menuItems);
    }

    public String toString() {
        return "Pancake House Menu";
    }

    // other menu methods here
}