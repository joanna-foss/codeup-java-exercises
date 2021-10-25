import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a. WHILE LOOP
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }

        //b. DO WHILE LOOP
        //b.1
//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//        } while(i<=100);
        //b.2
//        int i = 100;
//        do{
//            System.out.println(i);
//            i-=5;
//        } while(i>=-10);
        //b.3
//        int j = 2;
//        do{
//            System.out.println(j);
//            j = (int) Math.pow(j, 2); //why?
//        } while(j<1000000);

        //c. FOR LOOPS
        //c.1
//        for(int i = 0; i<=100; i++){
//            System.out.println(i);
//        }
        //c.2
//        for(int i = 100; i>=-10; i-=5){
//            System.out.println(i);
//        }
        //c.3
//        for(int j = 2; j<1000000; j=(int)Math.pow(j, 2)){
//            System.out.println(j);
//        }

        //2. Fizzbuzz
//        for(int i = 1; i<=100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //3.Display a table of powers
//        System.out.println("Enter an integer: ");
//        int integer = scanner.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("______ | _______ | _____");
//        int i = 1;
//        do{
//            System.out.println(i + "      | " + Math.pow(i, 2) + "     | " + Math.pow(i, 3));
//            i++;
//        } while(i <= integer);

        System.out.println("Do you want to continue? [Y/N]");
        char YorN = scanner.next().charAt(0);

        if(YorN == 'Y'){
            System.out.println("Enter in a number from 0 to 100 to see your corresponding grade: ");
            int grade = scanner.nextInt();
            if(grade<=59){
                System.out.println("Your grade is an F");
            } else if (grade<=66){
                System.out.println("Your grade is an D");
            } else if (grade<=79){
                System.out.println("Your grade is an C");
            } else if (grade<=87){
                System.out.println("Your grade is an B");
            }   else if (grade<=100){
                System.out.println("Your grade is an A");
            }
        }

    }
}
