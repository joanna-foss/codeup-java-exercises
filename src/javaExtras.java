import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class javaExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //SUPER SIMPLE CHAT BOT
//        System.out.println("Hey, I finally have a visitor! What's you're name?");
//        String name = scanner.nextLine();
//        chatBot(name);

        //HANGMAN GAME
        System.out.println("Want to play a game of hangman? [Y/N]");
        Boolean hangGame = scanner.nextLine().equalsIgnoreCase("y");
        if(hangGame){
            hangmanGame();
        } else {
            System.out.println("No worries!");
        }
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

    public static void hangmanGame(){

        //needed values
        Scanner scanner = new Scanner(System.in);
        int numOfIncorrect = 6;
        StringBuilder allGuesses = new StringBuilder();
        //end needed values

        System.out.println("**** WELCOME TO THE HANGMAN GAME, MY FRIEND *****\nYou will be given a random 4 letter word of the pet variety.\nYou have 6 attempts.\nGood luck!\n\nHere is your hidden word:\n");

        //random word generated here
        String[] fourLetterPets = {"dogs", "cats", "bird", "fish", "pigs", "cows", "duck", "goat", "frog"};
        Random obj = new Random();
        int randomNum = obj.nextInt(9);
        String word = (fourLetterPets[randomNum]);
        word = word.toUpperCase();

        String wordHide = word.replaceAll("[A-Z]", "_");
        System.out.println(word);
        System.out.println(wordHide);

        //start guessing
        do {
            System.out.println("Guess a letter: ");
            char letter = scanner.next().charAt(0);
            letter = Character.toUpperCase(letter);
            System.out.println("You guessed " + letter + "!");

            if (!allGuesses.toString().contains(letter)) {
                allGuesses.append(letter);
                if (!word.contains(letter)) {
                    numOfIncorrect -= 1;
                    System.out.printf("That wasn't one of the letters in the word!\nYou have %s guesses left! ", numOfIncorrect);
                } else {
                    replaceChar(wordHide, letter, word.indexOf(letter));
                    System.out.println(wordHide);
                }
            } else {
                System.out.println("You already guessed that letter, silly goose! Try another one.\n" + wordHide);
            }
        } while((numOfIncorrect != 0) || wordHide.contains("_"));
    }

    public static String replaceChar(String word, char letter, int index) {
        StringBuilder newWord = new StringBuilder(word);
        newWord.setCharAt(index, letter);
        return newWord.toString();
    }
}

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
