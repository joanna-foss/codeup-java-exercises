import java.util.Scanner;


//REVIEW WITH TRISTAN
public class ConsoleExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInteger = scanner.nextInt();
        System.out.println(userInteger);

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %s.", pi);
        System.out.print("Enter three words: ");
        String threeWords = scanner.nextLine();
        System.out.println(threeWords);

        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        System.out.println("Enter width of Codeup Classroom in feet: ");
        double usersWidth = scanner.nextDouble();

        System.out.println("Enter length of Codeup Classroom in feet: ");
        double usersLength = scanner.nextDouble();

        System.out.println("Enter width of Codeup Classroom in feet: ");
        double usersHeight = scanner.nextDouble();

        double area = usersWidth * usersLength;
        double perimeter = (usersWidth * 2) + (usersLength * 2);
        double volume = usersLength * usersWidth * usersHeight;

        System.out.printf("\nThe area of the Codeup dlassroom is: %s sqft", area);
        System.out.printf("\nThe perimeter of the Codeup classroom is: %s ft", perimeter);
        System.out.printf("\nThe volume of the Codeup classroom is: %s cubic feet", volume);
    }
}
