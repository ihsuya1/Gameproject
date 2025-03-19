package gameproject;

/**
 * Manages the War card game, including rounds and scoring.
 * 
 * Encapsulation: Private fields limit access to game internals.
 * Cohesion: This class manages game flow and logic.
 * Coupling: Loosely coupled, only interacts with Player and Deck.
 * Aggregation: WarGame contains Player and Deck, but they exist independently.
 * Flexibility/Maintainability: Easy to adjust rounds, rules, or scoring.
 */
public class WarGame {
    private Player player1;  // Aggregation: Players exist outside WarGame
    private Player player2;  // Aggregation: Players exist outside WarGame
    private Deck deck;  // Aggregation: Deck exists outside WarGame
    private final int TOTAL_ROUNDS = 4;  // Flexibility: Easy to modify game length

    public WarGame(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        deck = new Deck();
        deck.shuffle();

        // Distributes 10 cards per player, using deck
        for (int i = 0; i < 10; i++) {  
            if (!deck.isEmpty()) player1.addCard(deck.drawCard());
            if (!deck.isEmpty()) player2.addCard(deck.drawCard());
        }
    }

    public void startGame() {  // Cohesion: Only handles game flow
        int round = 1;
        while (round <= TOTAL_ROUNDS && player1.hasCards() && player2.hasCards()) {
            System.out.println("\nRound " + round + " begins...");
            
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();

            System.out.println(player1.getName() + " plays: " + card1);
            System.out.println(player2.getName() + " plays: " + card2);

            // Determines round winner and updates score
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins this round!\n");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins this round!\n");
            } else {
                System.out.println("It's a tie! No points awarded.\n");
            }

            round++;
        }

        displayWinner();
    }

    private void displayWinner() {  // Cohesion: Only handles winner announcement
        System.out.println("\nGame Over! Final Scores:");
        System.out.println(player1.getName() + ": " + player1.getScore() + " points");
        System.out.println(player2.getName() + ": " + player2.getScore() + " points");

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " is the WINNER!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " is the WINNER!");
        } else {
            System.out.println("It's a DRAW!");
        }
    }
}
