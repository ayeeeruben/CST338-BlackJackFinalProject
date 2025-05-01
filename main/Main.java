import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        do{
            Game g = new Game();
            System.out.println("Continue playing?");
        } while(s.next().equalsIgnoreCase("y"));
    }
}