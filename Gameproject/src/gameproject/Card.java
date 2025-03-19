package gameproject;

/**
 * Represents a playing card with a suit and value.
 * 
 * Encapsulation: Private fields suit and value ensure controlled access.
 * Cohesion: The class focuses only on card representation.
 */
public class Card {
    private String suit;  // Encapsulation: Keeps data private
    private int value;    // Encapsulation: Accessed via method only

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {  // Encapsulation: Provides controlled access
        return value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
