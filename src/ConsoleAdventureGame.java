import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void main(String[] args) {
        enter();
    }

    public static void enter() {
        Scanner welcomeSC = new Scanner(System.in);
        System.out.println("Press X to continue.\nPress any other key to exit.");
        boolean letsPlay = welcomeSC.next().equalsIgnoreCase("x");
        while(letsPlay){
            adventureGame();
            System.out.println("Press X to play again. Press any other key to exit.");
            letsPlay = welcomeSC.next().equalsIgnoreCase("x");
        }
        System.out.println("GG and GBye.");
    }

    public static void adventureGame(){
        createPlayers();
//        if(single){
//            //singleplayerGame();
//        } else {
//            //twoPlayerGame();
//        }
    }

    public static void createPlayers() {
        Scanner scanner = new Scanner(System.in);
        boolean create = true;

        System.out.println("Player, what is your name?");
        String player = scanner.nextLine().toUpperCase();
        Player player1 = new Player(player);
//        System.out.printf("\nWelcome, %s. Are you alone? [Y/N]", player1.name);
//        create = scanner.next().equalsIgnoreCase("y");

//        if (!create) {
//            System.out.println("Please enter the name of player 2: ");
//            String nextPlayer;
//            nextPlayer = scanner.nextLine().toUpperCase();
//
////            Player player2 = new Player(nextPlayer);
//            System.out.printf("\nWelcome, %s. Are you both ready to play? [Y/N]", nextPlayer);
//        }
    }
}
