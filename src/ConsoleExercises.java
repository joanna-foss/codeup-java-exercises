import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        System.out.println("Enter an integer: ");
//        Scanner integer = new Scanner(System.in);
//        int userInteger = integer.nextInt();
//        System.out.println(userInteger);

        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %s.", pi);
//        System.out.print("Enter three words: ");
//        Scanner threeWords = new Scanner(System.in);
//        String usersThreeWords = threeWords.nextLine();
//        System.out.println(usersThreeWords);

//        String firstWord = threeWords.next();
//        String secondWord = threeWords.next();
//        String thirdWord = threeWords.next();
//
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

        System.out.println("Enter width of Codeup Classroom in feet: ");
        Scanner width = new Scanner(System.in);
        double usersWidth = width.nextDouble();

        System.out.println("Enter length of Codeup Classroom in feet: ");
        Scanner length = new Scanner(System.in);
        double usersLength = length.nextDouble();

        System.out.println("Enter width of Codeup Classroom in feet: ");
        Scanner height = new Scanner(System.in);
        double usersHeight = height.nextDouble();

        double area = usersWidth * usersLength;
        double perimeter = (usersWidth * 2) + (usersLength * 2);
        double volume = usersLength * usersWidth * usersHeight;

        System.out.printf("\nThe area of the Codeup dlassroom is: %s sqft", area);
        System.out.printf("\nThe perimeter of the Codeup classroom is: %s ft", perimeter);
        System.out.printf("\nThe volume of the Codeup classroom is: %s cubic feet", volume);
    }
}
