import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//        String name = "Quasar";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);
//
//        String greeting = "Howdy";
//        String cohortName = "Quasar";
//
//        System.out.printf("%s, %s!", greeting, cohortName);

//        System.out.print("Enter something: ");
//
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.printf("You entered: %s", userInput);
    }
}
