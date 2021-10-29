import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        guessGame100();
    }

    public static void guessGame100(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to play the high/low guessing game? [Y/N]");
        boolean play = scanner.next().equalsIgnoreCase("y");

        while(play) {
            int random = randomNum();
            boolean inProg = true;

            while (inProg) {
                System.out.println("Guess a number between 1 and 100:");
                int userGuess = scanner.nextInt();
                if (userGuess < random) {
                    System.out.println("Higher!");
                } else if (userGuess > random) {
                    System.out.println("Lower!");
                } else {
                    inProg = false;
                    System.out.println("You guessed the exact right number!\nWould you like to play again? [Y/N]");
                    play = scanner.next().equalsIgnoreCase("y");
                }
            }
        }
        System.out.println("Okay! Have a great day!");
    }

    public static int randomNum(){
        Random random = new Random();
        int randomInt = random.nextInt(100);
        return randomInt;
    }
}
