import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void main(String[] args) {
        welcome();
    }

    public static void welcome() {
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

    }
}
