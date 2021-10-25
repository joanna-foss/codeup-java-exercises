import java.util.Scanner;

public class javaExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //SUPER SIMPLE CHAT BOT
        System.out.println("Hey, I finally have a visitor! What's you're name?");
        String name = scanner.nextLine();
        chatBot(name);

        //HANGMAN GAME
        System.out.println("Want to play a game of hangman?");
        //need a yes or no ability here.
        System.out.println("Enter in a word for player 2 to guess: ");
        String word = scanner.nextLine();
        hangmanGame(word);
    }

    public static void chatBot(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, " + name);
        Boolean how = true;
        do {
            System.out.println("How are you? [good/bad]");
            String howGood = scanner.nextLine();
            if (howGood.equalsIgnoreCase("good")) {
                System.out.println("Awesome, my dude! Are you super extra happy?");
                Boolean superExtraHappy = scanner.nextLine().equalsIgnoreCase("yes");
                if (superExtraHappy) {
                    System.out.println("That's so amazing, my dude. You deserve it. Live it up!");
                } else {
                    System.out.println("That's okay. Sounds like you're having a great day anyway. :)");
                }
                how = false;
            } else if (howGood.equalsIgnoreCase("bad")) {
                System.out.println("Gah, I'm sorry to hear that. Would cake make it better?");
                Boolean cakeYes = scanner.nextLine().equalsIgnoreCase("yes");
                if (cakeYes) {
                    System.out.println("Sweet! Literally!! Here have some cake!");
                } else {
                    System.out.println("It's one of those days, huh? Well, I'm here to help if I can. You just let me know what I can do for you.");
                }
                how = false;
            } else {
                System.out.println("I don't understand your answer. Try again.");
            }
        } while (how);
    }

    public static void hangmanGame(String word){
        int numGuesses = 0;
    }
}

//### Hangman Game

//- prompt a player 1 to enter a word for player 2 to guess
//- track the number of guesses by player 2
//- display to the user the partially completed word
//- string methods from the lesson will be helpful for this bonus

//# Console IO Exercises

//1. Prompt the user to enter a favorite quote
//    - output the quote
//    - ask them to enter how many words are in the quote
//    - output the number they entered
//    - output if the number they entered indeed matched the number of words

//1. Prompt the user to enter a list of top three favorite foods separated by only spaces

//    - Use the printf() to output the three top foods with the format:
//        1. FirstFood
//        2. SecondFood
//        3. ThirdFood

//1. Prompt the user to enter a grocery list of three items
//    - each item should only be separated by a comma (no spaces)
//    - you will need to use the .useDelimiter() method on your scanner object
//    - output the result as a comma-separated list using printf()
