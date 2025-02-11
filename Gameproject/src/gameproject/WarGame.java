/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

/**
 *
 * @author ayushi goswami
 */
public class WarGame {
    private Player player1;
    private Player player2;

    public WarGame(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        Deck deck = new Deck();

        // Distribute cards evenly
        while (deck.size() > 0) {
            player1.addCard(deck.drawCard());
            player2.addCard(deck.drawCard());
        }
    }

    public void startGame() {
        int round = 1;
        while (player1.hasCards() && player2.hasCards() && round <= 26) {
            System.out.println("Round " + round);
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();
            System.out.println(player1.getName() + " plays: " + card1);
            System.out.println(player2.getName() + " plays: " + card2);

            if (card1.getValue() > card2.getValue()) {
                player1.addCard(card1);
                player1.addCard(card2);
                System.out.println(player1.getName() + " wins this round!\n");
            } else if (card1.getValue() < card2.getValue()) {
                player2.addCard(card1);
                player2.addCard(card2);
                System.out.println(player2.getName() + " wins this round!\n");
            } else {
                System.out.println("It's a tie! Both cards are discarded.\n");
            }
            round++;
        }

        System.out.println("Game Over!");
        if (player1.getCardCount() > player2.getCardCount()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player2.getCardCount() > player1.getCardCount()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("It's a draw!");
        }
    }
    
}
