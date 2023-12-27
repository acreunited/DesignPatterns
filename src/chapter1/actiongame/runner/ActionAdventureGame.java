package chapter1.actiongame.runner;

//TODO - this import was created dynamically, check the settings to not import .*
import chapter1.actiongame.characters.*;
import chapter1.actiongame.characters.Character;

/**
 * To run our Action Adventure Game
 */
public final class ActionAdventureGame {

    /**
     * Private empty constructor
     */
    private ActionAdventureGame() {
        // empty
    }

    /**
     * Main method that runs this mini-game
     * @param args the args (not used)
     */
    public static void main(String[] args) {
        Character[] characters = {new King(), new Queen(), new Knight(), new Troll()};
        for (Character character : characters) {
            character.fight();
        }
    }
}
