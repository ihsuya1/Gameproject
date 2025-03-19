package gameproject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Manages a deck of cards, including shuffling and drawing.
 * 
 * Encapsulation: The cards list is private, ensuring controlled access.
 * Cohesion: The class is solely responsible for deck-related operations.
 * Coupling: Low coupling as it only interacts with Card.
 * Flexibility/Maintainability: Can modify deck size or shuffle logic easily.
 */
public class Deck {
    private List<Card> cards;  // Encapsulation: Keeps the list private

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (String suit : suits) {
            for (int value = 2; value <= 14; value++) { 
                cards.add(new Card(suit, value));
            }
        }
        shuffle();
    }

    public void shuffle() {  // Cohesion: Only handles deck-related tasks
        Collections.shuffle(cards);
    }

    public Card drawCard() {  // Encapsulation: Prevents direct list modification
        return cards.isEmpty() ? null : cards.remove(0);
    }

    public boolean isEmpty() {  
        return cards.isEmpty();
    }

    public int size() {  
        return cards.size();
    }
}
