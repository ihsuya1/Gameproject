package gameproject;

public class WarGame {
    private Player player1;
    private Player player2;
    private Deck deck;
    private final int TOTAL_ROUNDS = 4;

    public WarGame(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < 10; i++) {  
            if (!deck.isEmpty()) player1.addCard(deck.drawCard());
            if (!deck.isEmpty()) player2.addCard(deck.drawCard());
        }
    }

    public void startGame() {
        int round = 1;
        while (round <= TOTAL_ROUNDS && player1.hasCards() && player2.hasCards()) {
            System.out.println("\nRound " + round + " begins...");
            
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();

            System.out.println(player1.getName() + " plays: " + card1);
            System.out.println(player2.getName() + " plays: " + card2);

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

    private void displayWinner() {
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
