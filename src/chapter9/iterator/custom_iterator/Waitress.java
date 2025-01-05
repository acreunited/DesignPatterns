package chapter9.iterator.custom_iterator;

import chapter9.iterator.custom_iterator.iterator.Iterator;
import chapter9.iterator.custom_iterator.menu.DinnerMenu;
import chapter9.iterator.custom_iterator.menu.PancakeHouseMenu;

public class Waitress {

    private PancakeHouseMenu pancakeHouseMenu;

    private DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = this.dinnerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem);
        }
    }

}
