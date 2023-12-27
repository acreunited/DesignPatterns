package chapter1.actiongame.characters;

import chapter1.actiongame.weapons.WeaponBehavior;

/**
 * Class that defines a Character
 */
public abstract class Character {

    /**
     * The weapon
     */
    WeaponBehavior weapon;

    /**
     * The Constructor
     *
     * @param weapon the weapon
     */
    Character(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    /**
     * To make the Character fight
     */
    public abstract void fight();
}
