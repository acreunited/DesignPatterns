package chapter1.actiongame.characters;

import chapter1.actiongame.weapons.AxeBehavior;

/**
 * Class that represents the King
 */
public class King extends Character {

    /**
     * The constructor
     */
    public King() {
        super(new AxeBehavior());
    }

    @Override
    public void fight() {
        System.out.print("King: ");
        this.weapon.useWeapon();
    }
}
