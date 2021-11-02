import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String intro = scanner.nextLine();
        while(intro.isEmpty()){
            intro = scanner.nextLine();
        }
        System.out.println("Bob enters the chat.\nTo no longer talk to Bob, type \"Get me away from Bob.\"\n\nBob: What?");
        String input = scanner.nextLine();

        Bob(input);
    }

    public static void Bob(String value){
        Scanner scanner = new Scanner(System.in);
        boolean talk = true;
        String input = value;
        do {
            if (input.isEmpty()) {
                System.out.println("Bob: Fine. Be that way.");
            } else if (input.endsWith("!")) {
                System.out.println("Bob: Whoa! Chill out man!");
            } else if (input.endsWith("?")) {
                System.out.println("Bob: I don't know. And I really don't even care.");
            } else if (input.equalsIgnoreCase("get me away from bob.")) {
                System.out.println("Okay. Poof!");
                talk = false;
                break;
            } else {
                System.out.println("Bob: Whatever.");
            }
            input = scanner.nextLine();
        } while(talk);
    }
}

//REVIEW WITH SHANSHAN 10.26.2021