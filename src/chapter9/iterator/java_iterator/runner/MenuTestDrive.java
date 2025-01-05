package chapter9.iterator.java_iterator.runner;

import chapter9.iterator.java_iterator.Waitress;
import chapter9.iterator.java_iterator.menu.CafeMenu;
import chapter9.iterator.java_iterator.menu.DinnerMenu;
import chapter9.iterator.java_iterator.menu.PancakeHouseMenu;

public final class MenuTestDrive {

    private MenuTestDrive() {
        // empty
    }

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu, cafeMenu);
        waitress.printMenu();
    }
}
