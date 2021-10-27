import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Would you like to perform a calculation? [Y/N]");
//        Boolean wantCalc = scanner.nextLine().equalsIgnoreCase("y");
//
//        if (wantCalc) {
//            System.out.println("What arithmetic would you like to accomplish?");
//            String mathType = scanner.nextLine();
//
//            System.out.printf("Okay, you want to %s. What 2 numbers do you want to use?", mathType);
//            int num1 = scanner.nextInt();
//            int num2 = scanner.nextInt();
//
//            switch (mathType) {
//                case "add":
//                    System.out.println(add(num1, num2));
//                    break;
//                case "subtract":
//                    System.out.println(subtract(num1, num2));
//                    break;
//                case "multiply":
//                    System.out.println(multiply(num1, num2));
//                    break;
//                case "divide":
//                    System.out.println(divide(num1, num2) + "\nThe modulus of these two numbers is: " + modulus(num1, num2));
//                    break;
//                default:
//                    System.out.println("Nah, you've got to choose from the following: add, subtract, multiply, divide. Try again.");
//            }
//        } else {
//            System.out.println("Okay. Have a nice day.");
//        }
        factorial();
    }

//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static int subtract(int a, int b) {
//        return a - b;
//    }
//
//    public static int multiply(int a, int b) {
//        return a * b;
//    }
//
//    public static int divide(int a, int b) {
//        return a / b;
//    }
//
//    public static int modulus(int a, int b) {
//        return a % b;
//    }

    //2. Create a method that validates that user input is in a certain range.
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in a number between " + min + " and " + max + ": ");
        int userInput = scanner.nextInt();
        while (userInput < min || userInput > max) {
            return getInteger(min, max);
        }
        return userInput;
    }

    //3. Calculate a factorial of a number.
    public static int factorial() {
        int userInput = getInteger(1, 10);
        String factorialString = userInput + "!";

        int baseline = 1;
        for (int num = 1; num <= userInput; num++) {
            if (num != userInput) {
                factorialString = factorialString + " " + num + " x";
                baseline *= num;
            } else {
                factorialString = factorialString + " " + num;
                baseline *= num;
            }
        }
        factorialString = factorialString + " = " + baseline;
        System.out.println(factorialString);
        return baseline;
    }

    //4. Dice rolling simulation
    public static void dice(){
        Random sides = new Random();

    }
}