package util;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        System.out.println("Enter anything: ");
        String userInput = scanner.nextLine();
        System.out.printf("You entered: %s", userInput);
        return userInput;
    }

    public static boolean yesNo(){ //issues with this ignoring scanner input
        String input = scanner.nextLine();
        boolean yesNo = input.toLowerCase().matches("y|yes|true");
        System.out.println("Your answer indicates the answer is: " + yesNo);
        return yesNo;
    }

    public static int getInt(){
        int minimum = 0;
        int maximum = 21;
        int[] intArr = new int[2];
        while(minimum < 1 || minimum > 10) {
            System.out.println("Enter a number between 1-10: ");
            minimum = scanner.nextInt();
        }
        while(maximum < 15 || maximum > 20) {
            System.out.println("Enter in a number between 15-20: ");
            maximum = scanner.nextInt();
        }

        intArr[0] = minimum;
        intArr[1] = maximum;

        System.out.println(Arrays.toString(intArr));
        return getInt(intArr[0], intArr[1]);
    }

    public static int getInt(int min, int max){
        int validInt;
        do{
            System.out.println("Enter in a valid integer: ");
            validInt = scanner.nextInt();
        }while(validInt < min || validInt > max);


        return validInt;
    }

    public static double getDouble(){
        double minimum = 0.5;
        double maximum = 20.5;
        double[] doubleArr = new double[2];
        while(minimum < 1 || minimum > 10) {
            System.out.println("Enter a decimal number between 1-10: ");
            minimum = scanner.nextDouble();
        }
        while(maximum < 15 || maximum > 20) {
            System.out.println("Enter in a decimal number between 15-20: ");
            maximum = scanner.nextDouble();
        }

        doubleArr[0] = minimum;
        doubleArr[1] = maximum;

        System.out.println(Arrays.toString(doubleArr));
        return getDouble(doubleArr[0], doubleArr[1]);
    }

    public static double getDouble(double min, double max){
        double validDouble;
        do{
            System.out.println("Enter in a valid decimal number: ");
            validDouble = scanner.nextInt();
        }while(validDouble < min || validDouble > max);


        return validDouble;
    }
}
