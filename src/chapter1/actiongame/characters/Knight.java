package chapter1.actiongame.characters;

import chapter1.actiongame.weapons.SwordBehavior;

/**
 * Class that represents the Knight
 */
public class Knight extends Character {

    /**
     * The constructor
     */
    public Knight() {
        super(new SwordBehavior());
    }

    @Override
    public void fight() {
        System.out.print("Knight: ");
        this.weapon.useWeapon();
    }
}
