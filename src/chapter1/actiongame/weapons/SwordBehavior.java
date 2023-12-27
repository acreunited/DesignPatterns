package chapter1.actiongame.weapons;

/**
 * For when the Character uses a Sword
 */
public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I'm attacking you with a Sword");
    }
}
