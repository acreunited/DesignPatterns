package chapter9.iterator.java_iterator.menu;

import chapter9.iterator.java_iterator.MenuItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

    private Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Soup of the Day", "Soup of the day with salad", true, 3.69);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return this.menuItems.values().iterator();
    }
}
