package gameproject;
import java.util.LinkedList;
import java.util.Queue;

public class Player {
    private String name;
    private Queue<Card> cards;
    private int score;

    public Player(String name) {
        this.name = name;
        this.cards = new LinkedList<>();
        this.score = 0;
    }

    public String getName() {
        return name;
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
}
