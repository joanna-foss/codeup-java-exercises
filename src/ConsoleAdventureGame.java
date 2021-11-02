import java.util.Locale;
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
        String player1 = createPlayer();
        boolean isMulti = isMulti();
        if(!isMulti){
            singleplayerGame(player1);
        } else {
            String player2 = createPlayer();
            twoPlayerGame(player1, player2);
        }
    }

    public static String createPlayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String player = scanner.nextLine().toUpperCase();
        return player;
    }

    public static boolean isMulti(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you playing alone or do you have a partner? [Alone/Partner]");
        boolean isMulti = scanner.nextLine().equalsIgnoreCase("partner");
        if(isMulti){
            System.out.println("Ok, player 2...");
        }
        return isMulti;
    }

    public static void singleplayerGame(String name){
        System.out.printf("%s, you have chosen to play alone.\n", name);
        System.out.println("\n~~~~Welcome to MeowRim!~~~~\nThe cat fantasy adventure RPG.");
        System.out.printf("\n%s, you have just been born. However, you are not a baby. You are a fully-formed adult, and you are destined to be an adventurer.\nBut you are also a cat.\nYou are fluent in all cat dialects.\nTry your hand at your new language now.\nEnter any phrase to communicate: ", name);

        speakInCat();
        System.out.println("Excellent! You fit right in.");

        String weapon = weapon(name).toUpperCase();
        System.out.printf("\n%s, you have equipped * %s *.\n", name, weapon);
    }

    public static void twoPlayerGame(String name1, String name2){
        System.out.printf("%s and %s, this is the multi player game.\n", name1, name2);
    }

    public static void speakInCat(){
        Scanner scanner = new Scanner(System.in);
        String isWord = scanner.nextLine();

        if(isWord.endsWith("!")){
            System.out.println("Meow!");
        } else if (isWord.endsWith("?")) {
            System.out.println("Meow?");
        } else if (isWord.endsWith(".")) {
            System.out.println("Meow.");
        } else {
            System.out.println("Meow");
        }
    }

    public static String weapon(String name){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Now %s, it's time to choose your weapon.", name);
        System.out.println(" You can choose from the following:\n(1) SWORD\n(2) WAND\n(3) YOUR BARE HANDS *AHEM* I MEAN PAWS\nEnter a number [1/2/3]: ");
        int weaponChoice = scanner.nextInt();
        switch (weaponChoice){
            case 1:
                System.out.println("The almighty sword! Excellent choice for slaying unworthy beasts.");
                return "sword";
            case 2:
                System.out.println("You've made a magical selection. A wand for you to torment your adversaries!");
                return "wand";
            case 3:
                System.out.println("AH! You are one of the few who dare to use their powerfully spiky fluff balls to defeat their foes!\nDue to your sheer bravery, you will be given extra attack power during battle!");
                return "paws";
            default:
                System.out.println("You have made an incorrect selection and will now be granted a damp sponge with which to defend yourself.");
                return "sponge";
        }
    }
}
