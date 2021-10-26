import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String intro = scanner.nextLine();
        if(!intro.isEmpty()){
            System.out.println("Bob enters the chat.\nBob: What?");
            String input = scanner.nextLine();

            Bob(input);
        }
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
                System.out.println("Bob: Sure, whatever you say.");
            } else if (input.equalsIgnoreCase("get me away from bob.")) {
                System.out.println("Okay. Poof!");
                talk = false;
            } else {
                System.out.println("Bob: Whatever. I couldn't care less.");
            }
            input = scanner.nextLine();
        } while(talk);
    }
}
