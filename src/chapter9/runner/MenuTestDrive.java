package chapter9.runner;

import chapter9.Waitress;
import chapter9.menu.DinnerMenu;
import chapter9.menu.PancakeHouseMenu;

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
