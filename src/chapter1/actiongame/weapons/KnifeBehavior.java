package chapter1.actiongame.weapons;

/**
 * For when the weapon is a knife
 */
public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I'm attacking you with a knife");
    }
}
