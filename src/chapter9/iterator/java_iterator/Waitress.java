package chapter9.iterator.java_iterator;

import chapter9.iterator.java_iterator.menu.Menu;

import java.util.Iterator;

public class Waitress {

    private Menu pancakeHouseMenu;

    private Menu dinnerMenu;

    private Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = this.pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinnerIterator = this.dinnerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = this.cafeMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinnerIterator);
        System.out.println("\nDINNER");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem);
        }
    }
}
