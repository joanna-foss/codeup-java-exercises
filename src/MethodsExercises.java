import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to perform a calculation? [Y/N]");
        Boolean wantCalc = scanner.nextLine().equalsIgnoreCase("y");
        if(wantCalc){
            System.out.println("What arithmetic would you like to accomplish?");
            String mathType = scanner.nextLine();
            System.out.printf("Okay, you want to %s. What 2 numbers do you want to use?", mathType);
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            switch(mathType){
                case "add":
                    System.out.println(add(num1, num2));
                    break;
                case "subtract":
                    System.out.println(subtract(num1, num2));
                    break;
                case "multiply":
                    System.out.println(multiply(num1, num2));
                    break;
                case "divide":
                    System.out.println(divide(num1, num2));
                    break;
                default:
                    System.out.println("Nah, you've got to choose from the following: add, subtract, multiply, divide. Try again.");
            }
        } else {
            System.out.println("Okay. Have a nice day.");
        }
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }
}
