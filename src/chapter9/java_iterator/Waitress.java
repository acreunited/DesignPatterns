package chapter9.java_iterator;

import chapter9.java_iterator.menu.Menu;

import java.util.Iterator;

public class Waitress {

    private Menu pancakeHouseMenu;

    private Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = this.pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinnerIterator = this.dinnerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem);
        }
    }
}
