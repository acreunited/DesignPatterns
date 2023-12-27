package chapter1.actiongame.characters;

import chapter1.actiongame.weapons.BowAndArrowBehavior;

/**
 * Class that represents the Queen
 */
public class Queen extends Character {

    /**
     * The constructor
     */
    public Queen() {
        super(new BowAndArrowBehavior());
    }

    @Override
    public void fight() {
        System.out.print("Queen: ");
        this.weapon.useWeapon();
    }
}
