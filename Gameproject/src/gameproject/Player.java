package gameproject;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Represents a player in the War game.
 *
 * Design Principles:
 * - Encapsulation: Fields are private, exposed via getters/setters.
 * - Cohesion: Player only manages their own data and card queue.
 * - Composition: Player "has-a" collection of Cards.
 */
public class Player {
    private String name;
    private Queue<Card> cards;
    private int score;

    public Player(String name) {
        this.name = name;
        this.cards = new LinkedList<>();
        this.score = 0;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card playCard() {
        return cards.poll();
    }

    public boolean hasCards() {
        return !cards.isEmpty();
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
