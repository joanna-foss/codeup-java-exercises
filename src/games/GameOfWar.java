package games;

import java.util.Arrays;
import java.util.List;

///The game should play 26 rounds, sum up each won game for each player.  Then output the winning player. Should be player vs computer.
public class GameOfWar {
    public static int numOfRounds = 26;
    public static void main(String[] args) {
        Player player1 = new Player();
        System.out.println("You have begun the Game of War!");
        player1.setName();
        System.out.println("player1.name = " + player1.name);

        do{
            numOfRounds--;
        } while(numOfRounds>0);
    }
}
