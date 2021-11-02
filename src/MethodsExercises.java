import util.Input;

import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println("Would you like to perform a calculation? [Y/N]");
        boolean wantCalc = userInput.getString().equalsIgnoreCase("y");

        if (wantCalc) {
            System.out.println("What arithmetic would you like to accomplish?");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            int mathType = userInput.getInt();

            System.out.printf("Okay, and what 2 numbers do you want to use to accomplish this?");
            int num1 = userInput.getInt();
            int num2 = userInput.getInt();

            switch (mathType) {
                case 1:
                    System.out.println(add(num1, num2));
                    break;
                case 2:
                    System.out.println(subtract(num1, num2));
                    break;
                case 3:
                    System.out.println(multiply(num1, num2));
                    break;
                case 4:
                    System.out.println(divide(num1, num2) + "\nThe modulus of these two numbers is: " + modulus(num1, num2));
                    break;
                default:
                    System.out.println("Nah, you've got to choose from the following: add, subtract, multiply, divide. Try again.");
            }
        } else {
            System.out.println("Okay. Have a nice day.");
        }
        dice();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dice Roll Arena!!! You can choose 4, 6, 8, 10, or 20.");
        System.out.println("Would you like to get ready to roll? [Y/N]");
        boolean choice = scanner.nextLine().equalsIgnoreCase("y");
        while(choice) {
            int chosenDice = getInteger(4, 20);

            Random sides = new Random();
            int roll = sides.nextInt(chosenDice - 1) + 1;
            System.out.printf("You rolled %s!\n", roll);
            System.out.println("Would you like to roll again?");
            choice = scanner.nextLine().equalsIgnoreCase("yes");
        }
        System.out.println("OKAY! See ya next time!!");
    }
}