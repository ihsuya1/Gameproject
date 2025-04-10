package gameproject;

/**
 * Manages the flow of the War card game.
 *
 * Design Principles:
 * - Encapsulation: Fields like player1, player2, deck are private.
 * - Cohesion: Manages the game loop and score tracking.
 * - Aggregation: WarGame uses Player and Deck but does not own them exclusively.
 * - Flexibility: TOTAL_ROUNDS can be easily changed.
 */
public class WarGame {
    private Player player1;
    private Player player2;
    private Deck deck;
    private final int TOTAL_ROUNDS = 4;

    public WarGame(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        deck = new Deck();

        dealCards();
    }

    private void dealCards() {
        for (int i = 0; i < 10; i++) {
            if (!deck.isEmpty()) player1.addCard(deck.drawCard());
            if (!deck.isEmpty()) player2.addCard(deck.drawCard());
        }
    }

    public void startGame() {
        int round = 1;

        while (round <= TOTAL_ROUNDS && player1.hasCards() && player2.hasCards()) {
            System.out.println("\nRound " + round);

            Card card1 = player1.playCard();
            Card card2 = player2.playCard();

            System.out.println(player1.getName() + " plays " + card1);
            System.out.println(player2.getName() + " plays " + card2);

            if (card1.getNumericValue() > card2.getNumericValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins the round!");
            } else if (card1.getNumericValue() < card2.getNumericValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins the round!");
            } else {
                System.out.println("It's a tie. No points awarded.");
            }

            round++;
        }

        displayWinner();
    }

    private void displayWinner() {
        System.out.println("\nFinal Scores:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " is the WINNER!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " is the WINNER!");
        } else {
            System.out.println("It's a DRAW!");
        }
    }
}
