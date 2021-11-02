package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){ //issues with this ignoring scanner input
        String input = scanner.next();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public int getInt(){
        return scanner.nextInt();
    }

    public int getInt(int min, int max){
        int validInt;
        do{
            System.out.println("Make your choice here: ");
            validInt = scanner.nextInt();
        }while(validInt < min || validInt > max);

        return validInt;
    }

    public double getDouble(){
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max){
        double validDouble;
        do{
            System.out.println("Enter in a valid decimal number: ");
            validDouble = scanner.nextDouble();
        }while(validDouble < min || validDouble > max);

        return validDouble;
    }
}
