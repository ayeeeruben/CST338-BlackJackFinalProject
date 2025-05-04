import java.util.Scanner;

public class Main{
    public static void main(String[] args){
//        Scanner s = new Scanner(System.in);
//        do{
//            Game g = new Game();
//            System.out.println("Continue playing?");
//        } while(s.next().equalsIgnoreCase("y"));



        //testing card
        Card card1 = new Card(13, "Hearts"); // Ace of Hearts
        System.out.println(card1.getName()); // "King"
        System.out.println(card1.getValue()); // 10
        System.out.println(card1.toString()); // "King of Hearts"

        //testing generate deck
        Deck deck = new Deck();
        deck.generateDeck();

        //prints deck BEFORE removing
        System.out.println("\nBEFORE");
        for (Card card : deck.getDeck()) {
            System.out.println(card);
        }

        Card cRemove = new Card(13, "Hearts");
        System.out.println("\nRemoving: " + cRemove);
        deck.removeCard(cRemove);
        //prints deck AFTER removing
        System.out.println("\nAFTER");
        for (Card card : deck.getDeck()) {
            System.out.println(card);
        }
        System.out.println("\nSize: " + deck.getDeck().size());



    }
}