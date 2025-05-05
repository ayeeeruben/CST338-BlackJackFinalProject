import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int score;

    public Hand() {
        cards = new ArrayList<Card>();
        score = 0;
    }

    public void getHit(Card card) {
        //getHit will take in a card, add it to the hand and update the score
        cards.add(card);
        score += card.getValue(); //are we assuming aces are always 11? if not that could be solved here
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


    public void reset() {
        score = 0;
        cards = new ArrayList<>();
    }

    public int calculateScore() {
        return score;
    }
}