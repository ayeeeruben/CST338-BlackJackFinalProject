import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>(52);
    private int cardCount = 52; //this will decrement as we pull cards
    private static final String[] suits = new String[] {"Hearts","Diamonds","Clubs","Spades"};

    public Deck() {
    }

    public void generateDeck(){
        //loops through every suit and for every suit it loops 13 times (makes a card for every rank and suit)
        for(int i = 0; i < suits.length; i++) {
            for(int k = 1; k <= 13; k++) {
                cards.add(new Card(k, suits[i]));
            }
        }

    }
    public void removeCard(Card card) {
        if(cards.remove(card)) {
            cardCount--;
        }
    }

    public ArrayList<Card> getDeck() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

}