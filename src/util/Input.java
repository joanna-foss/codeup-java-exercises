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
        try {
            String s = getString();
            return Integer.valueOf(s);
        } catch(NumberFormatException e){
            return getInt();
        }
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
        try {
            String s = getString();
            return Double.valueOf(s);
        } catch(NumberFormatException e){
            return getDouble();
        }
    }

    public double getDouble(double min, double max){
        double validDouble;
        do{
            System.out.println("Enter in a valid decimal number: ");
            validDouble = scanner.nextDouble();
        }while(validDouble < min || validDouble > max);

        return validDouble;
    }

    public Integer getBinary(){
        try{
            String binaryStr = getString();
            return Integer.parseInt(binaryStr, 2);
        } catch(NumberFormatException e){
            System.out.println("That was not a valid binary number. Try again: ");
            return getBinary();
        }
    }

    public Integer getHex(){
        try {
            String hexStr = getString();
            return Integer.parseInt(hexStr, 16);
        } catch(NumberFormatException e){
            System.out.println("That was not a valid hexidecimal number. Try again: ");
            return getHex();
        }
    }
}
