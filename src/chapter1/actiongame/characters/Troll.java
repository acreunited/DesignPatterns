package chapter1.actiongame.characters;

import chapter1.actiongame.weapons.KnifeBehavior;

/**
 * Class that represents the Troll
 */
public class Troll extends Character {

    /**
     * The constructor
     */
    public Troll() {
        super(new KnifeBehavior());
    }

    @Override
    public void fight() {
        System.out.print("Troll: ");
        this.weapon.useWeapon();
    }
}
