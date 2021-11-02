import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a. WHILE LOOP
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        //b. DO WHILE LOOP
        //b.1
        int a = 0;
        do {
            System.out.println(a);
            a += 2;
        } while (a <= 100);
        //b.2
        int b = 100;
        do {
            System.out.println(b);
            b -= 5;
        } while (b >= -10);
        //b.3
        int c = 2;
        do {
            System.out.println(c);
            c = (int) Math.pow(c, 2); //why?
        } while (c < 1000000);

        //c. FOR LOOPS
        //c.1
        for (int d = 0; d <= 100; d++) {
            System.out.println(d);
        }
        //c.2
        for (int e = 100; e >= -10; e -= 5) {
            System.out.println(e);
        }
        //c.3
        for (int f = 2; f < 1000000; f = (int) Math.pow(f, 2)) {
            System.out.println(f);
        }

        //2. Fizzbuzz
        for (int g = 1; g <= 100; g++) {
            if (g % 3 == 0 && g % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (g % 3 == 0) {
                System.out.println("Fizz");
            } else if (g % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(g);
            }
        }

        //3.Display a table of powers //REFACTOR WITH TRISTAN
        boolean confirm;
        do {
            System.out.println("Enter an integer: ");
            int integer = scanner.nextInt();

            System.out.println("Oh yay! Our table! It's not broken!");
            System.out.println("number | squared | cubed");
            System.out.println("______ | _______ | _____");

            for (int z = 1; z <= integer; z++) {
                System.out.printf("%-7d|%-9d|%-6d\n", z, z * z, z * z * z);
            }

            System.out.println("Do you want to see another table? [y/n]");
            confirm = scanner.next().equalsIgnoreCase("y");
        } while (confirm);

//            MY ATTEMPT
//            int h = 1;
//            do {
//                System.out.println(i + "      | " + Math.round(Math.pow(h, 2)) + "       | " + Math.round(Math.pow(h, 3)));
//                h++;
//            } while (h <= 3);
//            do {
//                System.out.println(h + "      | " + Math.round(Math.pow(h, 2)) + "      | " + Math.round(Math.pow(h, 3)));
//                h++;
//            } while (h <= integer);
//        } else {
//            System.out.println("Ok.");
//        }

        //4. Convert number grades into letter grades.
        System.out.println("Do you want to continue to your letter grade? [y/n]");
        char YorN = scanner.next().charAt(0);

        while (Objects.equals(YorN, 'y')) {
            System.out.println("Enter in a number from 0 to 100 to see your corresponding grade: ");
            int grade = scanner.nextInt();
            if (grade <= 59) {
                System.out.println("Your grade is an F.");
                if (grade > 57) {
                    System.out.println("It's an F+ actually.");
                }
            } else if (grade <= 66) {
                System.out.println("Your grade is a D.");
                if (grade > 64) {
                    System.out.println("It's actually a D+.");
                }
            } else if (grade <= 79) {
                System.out.println("Your grade is a C.");
                if (grade > 75) {
                    System.out.println("You have a C+.");
                }
            } else if (grade <= 87) {
                System.out.println("Your grade is a B!");
                if (grade > 84) {
                    System.out.println("It's actually a B+!");
                }
            } else if (grade <= 100) {
                System.out.println("Your grade is an A!!!");
                if (grade > 98) {
                    System.out.println("You actually have an A+!!!");
                }
            }
            System.out.println("Do you want to see another letter grade? [y/n]");
            YorN = scanner.next().charAt(0);
        }
        System.out.println("Ok.");
    }
}
