package gameproject;

/**
 * Main driver class to run the War game.
 *
 * Design Principles:
 * - Flexibility: Main class simply calls WarGame. Easy to expand.
 * - Low Coupling: Depends only on WarGame's public interface.
 */
public class Gameproject {
    public static void main(String[] args) {
        WarGame game = new WarGame("Player 1", "Player 2");
        game.startGame();
    }
}
