import java.util.Random;
import java.util.Scanner;

public class Game{

    private static int winCount;
    private static int loseCount;
    private static int tieCount;

    private Hand dealerHand;
    private Hand playerHand;
    private Deck currentDeck;

    static {
        winCount = 0;
        loseCount = 0;
        tieCount = 0;
    }

    public Game(){
        currentDeck = new Deck();
        currentDeck.shuffle();
        playerHand = new Hand(currentDeck);
        dealerHand = new Hand(currentDeck);
    }

    public Game(Random r){
        currentDeck = new Deck();
        currentDeck.shuffle(r);
        playerHand = new Hand(currentDeck);
        dealerHand = new Hand(currentDeck);
    }

    public void quit(){
        return;
    }
}