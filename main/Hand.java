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

    public boolean hasBlackJack(){
        if (cards.size() != 2){
            return false;
        }

        String firstCard = cards.get(0).getName();
        String secondCard = cards.get(1).getName();

        if(firstCard.equals("Ace") && containsA10Card(secondCard)){
            return true;
        }else if (secondCard.equals("Ace") && containsA10Card(firstCard)){
            return true;
        }
        return false;
    }

    private boolean containsA10Card(String cardName){
        String [] faceCards = {"Jack", "Queen", "King", "10"};
        for(String card : faceCards){
            if(cardName.equals(card)){
                return true;
            }
        }
        return false;
    }

}