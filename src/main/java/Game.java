import java.util.Random;
import java.util.Scanner;

public class Game {

    private static int total = 0;
    private static String lastPlayer = "";
    private static String otherPlayer = "";

    private static Dice dice1 = new Dice("dice1");
    private static Dice dice2 = new Dice("dice2");

    public static void main(String[] args) {


        System.out.println("Starting the game....");

        while (true) {

            int nextDice1Random = dice1.roll();
            int nextDice2Random = dice2.roll();

            total += nextDice1Random + nextDice2Random;

            System.out.printf("Dice-1 Generated number is: %d, Dice-2 Generated number is: %d, Current total is: %d \n", nextDice1Random, nextDice2Random, total);

            // check the total exceeds 21
            if (total > 21) break;

            System.out.println( "Do you want to play or hold" );
            Scanner scan=new Scanner(System.in);
            String actionAsString=scan.nextLine();

            InputCollector collector = new InputCollector();
            Action action;

            try {
                action = collector.collectAction(actionAsString);

                if (action.equals(Action.PLAY)) {
                    lastPlayer = "you";
                    otherPlayer = "computer";
                } else if (action.equals(Action.HOLD)) {
                    lastPlayer = "computer";
                    otherPlayer = "you";
                }

            } catch (ActionNotSupportedException e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }

        }


        System.out.printf("Winner is: %s, Loser is: %s \n", otherPlayer, lastPlayer);

    }
}
