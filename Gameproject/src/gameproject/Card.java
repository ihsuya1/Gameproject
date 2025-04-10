package gameproject;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a single playing card with a suit and rank.
 *
 * Design Principles:
 * - Encapsulation: Fields suit and rank are private.
 * - Cohesion: This class handles only card-related logic.
 * - Low Coupling: Interacts with other classes only via public methods.
 */
public class Card {
    private String suit;
    private String rank;
    private static final Map<String, Integer> rankValues = new HashMap<>();

    // Static initialization block to assign rank values
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
        rankValues.put("A", 14); // Ace is highest
    }

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getNumericValue() {
        return rankValues.get(rank);
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
