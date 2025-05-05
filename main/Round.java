public class Round {
    private Hand dealertHand;
    private Hand playerHand;
    private Deck currentDeck;

    public Round() {
        playerHand = new Hand();
        currentDeck = new Deck();
        dealertHand = new Hand();
    }

    public void gameRun(){
        currentDeck.generateDeck();

    }

    public void quit(){
        return;
    }


}