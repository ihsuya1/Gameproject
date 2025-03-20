package gameproject;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Represents a player in the game, managing their cards and score.
 * 
 * Encapsulation: Private fields ensure controlled access.
 * Cohesion: Focused on player-specific functionality.
 * Coupling: Low, interacts only with Card.
 * Composition: `Player` owns `QueueCard` directly.
 */
public class Player {
    private String name;      // Encapsulation: Name is private
    private Queue<Card> cards;  // Composition: Cards belong only to this player
    private int score;        // Encapsulation: Score is private

    public Player(String name) {
        this.name = name;
        this.cards = new LinkedList<>();
        this.score = 0;
    }

    public String getName() {  
        return name;
    }

    public void addCard(Card card) {  // Encapsulation: Cards managed internally
        cards.add(card);
    }

    public Card playCard() {  // Cohesion: Only manages player’s cards
        return cards.poll();  // FIFO ensures fair play order
    }

    public boolean hasCards() {  
        return !cards.isEmpty();
    }

    public void incrementScore() {  // Encapsulation: Score updated internally
        score++;
    }

    public int getScore() {  
        return score;
    }
}
