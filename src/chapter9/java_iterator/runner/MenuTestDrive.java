package chapter9.java_iterator.runner;

import chapter9.java_iterator.Waitress;
import chapter9.java_iterator.menu.DinnerMenu;
import chapter9.java_iterator.menu.PancakeHouseMenu;

public final class MenuTestDrive {

    private MenuTestDrive() {
        // empty
    }

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
        waitress.printMenu();
    }
}
