import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<Card>();

    }

    public void getHit(Card card) {
        //getHit will take in a card, add it to the hand and update the score
        cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void reset() {
        cards = new ArrayList<>();
    }

    public int calculateScore() {
        int sum = 0;
        for(Card card : cards) {
            sum += card.getValue();
        }

        if(sum >21){
            int aceCount =0;
            for(Card card : cards) {
                if(card.getName().equals("Ace")){
                    aceCount++;
                }
            }
            sum -= (aceCount * 10);
        }

        return sum;
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