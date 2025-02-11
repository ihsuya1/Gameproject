/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ayushi goswami
 */
public class Player {
    private String name;
    private Queue<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new LinkedList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card playCard() {
        return hand.poll();
    }

    public int getCardCount() {
        return hand.size();
    }

    public boolean hasCards() {
        return !hand.isEmpty();
    }

    public String getName() {
        return name;
    }
    
}
