package games;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

///The game should play 26 rounds, sum up each won game for each player.  Then output the winning player. Should be player vs computer.
public class GameOfWar {
    public static int numOfRounds = 26;
    public static Card[] cards = CardsArray.findAll();
    public static Card[] cardsCopy = {};
    public static Scanner scanner = new Scanner(System.in);
    public static boolean ready;

    public static void main(String[] args) {
        Player player1 = new Player();
        System.out.println("You have begun the Game of War!");
//        for(int i = 0; i < cards.length; i++){
//            System.out.println("cards[i].getCard() = " + cards[i].getCard());
//        }
        player1.setName();
        System.out.printf("%s, you will play 26 rounds and whoever plays the higher card each round wins that round.%n", player1.name);
        System.out.printf("%s, are you ready to begin?", player1.name);
        ready = scanner.next().equalsIgnoreCase("yes");
        if (ready) {
            do {
                Card computerCard = new Card(getRandomCard());
                Card playerCard = new Card(getRandomCard());

                System.out.println("computerCard = " + computerCard.getCardInfo());
                System.out.println("playerCard = " + playerCard.getCardInfo());
                System.out.println("Continue?");
                ready = scanner.next().equalsIgnoreCase("yes");
                numOfRounds--;
            } while (numOfRounds > 0);
        }
    }
        ;

        public static Card getRandomCard() {
            Random random = new Random();
            int number = random.nextInt(51) + 1;
            return cards[number];
        }
    }

// MY ATTEMPTS AT CREATING A NEW ARRAY AFTER EVERY CARD DRAWN. DOES NOT WORK.
//    public Card[] getCards(){
//        String playedCard = getRandomCard();
//        System.arraycopy(cards, i+1, cardsCopy, i, cards.length-1-1);
//    }

//    public int findIndex(int arr[], int ind){
//        int length = arr.length;
//        int i = 0;
//        while(i < length){
//            if(arr[i] == ind){
//                return i;
//            } else {
//                i = i + 1;
//            }
//        }
//        return -1;
//    }