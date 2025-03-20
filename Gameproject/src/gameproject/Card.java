package gameproject;

import java.util.Map;
import java.util.HashMap;

/**
 * Represents a single playing card with a suit and rank.
 * 
 * Encapsulation: Keeps suit and rank private.
 * Cohesion: Only responsible for storing card data.
 */
public class Card {
    private String suit;  // Encapsulation: Keeps suit private
    private String rank;  // Encapsulation: Keeps rank private
    private static final Map<String, Integer> rankValues = new HashMap<>();

    // Static block to assign numeric values to ranks
    static {
        rankValues.put("2", 2);
        rankValues.put("3", 3);
        rankValues.put("4", 4);
        rankValues.put("5", 5);
        rankValues.put("6", 6);
        rankValues.put("7", 7);
        rankValues.put("8", 8);
        rankValues.put("9", 9);
        rankValues.put("10", 10);
        rankValues.put("J", 11);
        rankValues.put("Q", 12);
        rankValues.put("K", 13);
        rankValues.put("A", 14);  // Ace is highest
    }

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Get numeric value for comparison
    public int getNumericValue() {
        return rankValues.get(rank);
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
