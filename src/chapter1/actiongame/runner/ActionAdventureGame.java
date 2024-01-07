package chapter1.actiongame.runner;

import chapter1.actiongame.characters.Character;
import chapter1.actiongame.characters.King;
import chapter1.actiongame.characters.Knight;
import chapter1.actiongame.characters.Queen;
import chapter1.actiongame.characters.Troll;

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
