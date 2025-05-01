public class Card{
    private int value;
    private char cardCharacter;

    public Card(int value, char cardCharacter){
        this.value = value;
        this.cardCharacter = cardCharacter;
    }

    public int getValue(){
        return value;
    }

    public char getCardCharacter(){
        return cardCharacter;
    }


}
