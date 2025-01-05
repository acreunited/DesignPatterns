package chapter9.java_iterator.menu;

import chapter9.java_iterator.MenuItem;
import chapter9.java_iterator.iterator.DinnerMenuIterator;

import java.util.Iterator;

public class DinnerMenu {

    private static final int MAX_ITEMS = 4;

    private int numberOfItems = 0;

    private MenuItem[] menuItems;

    public DinnerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whote weat", true, 2.99);
        addItem("BLT", "Baconw ith lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (this.numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            this.menuItems[this.numberOfItems] = menuItem;
            this.numberOfItems = this.numberOfItems + 1;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(this.menuItems);
    }

    public String toString() {
        return "Diner Menu";
    }
    // other menu methods here
}