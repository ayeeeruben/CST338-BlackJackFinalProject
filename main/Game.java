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

    public boolean checkInitialHand(){
        //determines if the player or dealer have won with a black jack on the initial deal
        if(playerHand.hasBlackJack() && dealerHand.hasBlackJack()){
            tieCount++;//tie
            return true;
        } else if (playerHand.hasBlackJack() && !dealerHand.hasBlackJack()) {
            winCount++;
            return true;
        }else if (dealerHand.hasBlackJack() && !playerHand.hasBlackJack()){
            loseCount++;
            return true;
        }
        return false;
    }

    public void checkWinner(){
        if(playerHand.calculateScore() > dealerHand.calculateScore()){
            winCount++;
            return;
        } else if (playerHand.calculateScore() < dealerHand.calculateScore()) {
            loseCount++;
            return;
        }
        tieCount++;
    }

    public void playersTurn(){
        if(playerHand.getCards().size() != 2 || dealerHand.getCards().size() != 2){
            return; //should not happen
        }
        Scanner in = new Scanner(System.in);
        while(!playerHand.scoreBusts()){
            //will probably look much different in android
            System.out.println("Score: " + playerHand.calculateScore());
            System.out.println("Hit (h) or stand (s): ");
            String input = in.nextLine().trim().toLowerCase();
            if(input.equals("h")){
                playerHand.getHit();
                System.out.println("Hit, score = " + playerHand.calculateScore());
            }else if (input.equals("s")){
                System.out.println("Stand");
                break;
            }else{
                System.out.println("Input h or s");
            }
        }
    }

    public void dealersTurn(){
        if (dealerHand.getCards().size() != 2 ){
            return; //should not happen
        }
        while(!dealerHand.scoreBusts() && dealerHand.calculateScore() != 17){
            dealerHand.getHit();
        }
    }

}