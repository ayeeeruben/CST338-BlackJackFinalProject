import java.util.ArrayList;
import java.util.List;

public class Deck {
    private Card[] cards = new Card [52];
    private int cardCount = 52; //this will decrement as we pull cards
    private static final char[] suits = new char[] {'H','D','C','S'};

    public Deck() {
    }

    public void generateDeck(){
        int j = 0;
        for(int i = 0; i < suits.length; i++) {
            for(int k = 0; k < 13; k++) {
                cards[j] = new Card(k, suits[i]);
                j++;
            }
        }

    }
    public void removeCard(Card card) {

    }

}