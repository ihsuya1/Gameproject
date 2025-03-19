package gameproject;

/**
 * Main class to run the War Game.
 * 
 * Flexibility/Maintainability: Changing game settings is easy.
 */
public class Gameproject {
    public static void main(String[] args) {
        WarGame game = new WarGame("Player 1", "Player 2");
        game.startGame();
    }
}
