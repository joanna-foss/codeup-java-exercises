package games;

import java.util.Arrays;
import java.util.Scanner;

public class TheGameOfWar {
    public static void main(String[] args) {
        playWar();
    }

    private static void playWar() {
        Player player1 = new Player();
        Player computer = new Player("Computer");
        System.out.println("You have begun the Game of War!");

        player1.setName();
        System.out.printf("%s, you will play 26 rounds and whoever plays the higher card each round wins that round.%n", player1.name);
        System.out.println("Win more rounds than the computer and you win the game!\n");
        System.out.printf("%s, enter 'yes' when you are ready to begin.", player1.name);
        ready = scanner.next().equalsIgnoreCase("yes");

        if (ready) {
            deckCopy = shuffle();
            do {
                Card computerCard = new Card(deckCopy[0]);
                Card playerCard = new Card(deckCopy[1]);

                System.out.println("\nThe computer played: " + computerCard.getCardInfo());
                System.out.println("You played: " + playerCard.getCardInfo());
                numOfRounds--;
                if (computerCard.numValue > playerCard.numValue) {
                    System.out.println("\nThe computer won this round!\n");
                    computer.addWin();
                } else if (playerCard.numValue > computerCard.numValue) {
                    System.out.println("\nYou won this round!\n");
                    player1.addWin();
                } else {
                    System.out.println("\nYou tied! No one wins this round.\n");
                }
                System.out.printf("So far, the computer has %s wins and you have %s wins!%n", computer.gamesWon, player1.gamesWon);

                deckCopy = Arrays.copyOfRange(deckCopy, 2, deckCopy.length);
                System.out.println("deckCopy.length = " + deckCopy.length);
                System.out.println("Enter anything to play the next round.");
                scanner.next();
            } while (numOfRounds > 0);
        }

        if (player1.gamesWon > computer.gamesWon) {
            System.out.printf("%nCONGRATS!!! You finished the game with a total of %s wins. YOU WON THE GAME OF WAR!%n", player1.gamesWon);
        } else if (computer.gamesWon > player1.gamesWon) {
            System.out.printf("%nGAH! The computer beat you with a total of %s wins. YOU LOST THE GAME OF WAR.%n", computer.gamesWon);
        } else {
            System.out.println("%nLooks like it's a tie! No defeat, but also no loss!%n");
        }
    }

    private static Card[] shuffle() {
        for (int i = 1; i < deck.length; i++) {
            int random = (int) (Math.random() * deck.length);
            Card currentCard = deck[i];
            deck[i] = deck[random];
            deck[random] = currentCard;
        }
        return deck;
    }

    public static int numOfRounds = 26;
    public static Card[] deck = CardsArray.getAllCards();
    public static Card[] deckCopy;
    public static Scanner scanner = new Scanner(System.in);
    public static boolean ready;
}