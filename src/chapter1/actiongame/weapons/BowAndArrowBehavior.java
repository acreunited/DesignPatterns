package chapter1.actiongame.weapons;

/**
 * For when the weapon is a Bow and Arrow
 */
public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I'm attacking you with a Bow and Arrow");
    }
}
