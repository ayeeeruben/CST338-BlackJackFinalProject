import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int score;

    public Hand() {
        cards = new ArrayList<Card>();
        score = 0;
    }

    public void getHit(Card card) {

    }

    public void reset() {

    }

    public int calculateScore() {
        return score;
    }
}