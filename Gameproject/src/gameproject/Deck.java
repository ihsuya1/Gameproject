package gameproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Manages a deck of playing cards.
 *
 * Design Principles:
 * - Encapsulation: cards list is private.
 * - Cohesion: Handles only deck creation, shuffling, and drawing.
 * - Flexibility: Easy to change deck size, shuffle logic.
 *
 * Design Pattern:
 * - Factory Pattern: Creates and initializes card objects in bulk.
 */
public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        generateDeck();  // Factory Pattern used here
        shuffle();
    }

    private void generateDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));  // Card creation encapsulated
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.isEmpty() ? null : cards.remove(0);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public int size() {
        return cards.size();
    }
}
