package chapter1.actiongame.weapons;

/**
 * For when the Character uses an Axe
 */
public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I'm attacking you with an Axe");
    }
}
