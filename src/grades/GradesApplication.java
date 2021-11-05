package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student joanna = new Student("Joanna Fofanna");
        Student notjoanna = new Student("Not Joanna");
        Student thing1 = new Student("Thing One");
        Student thing2 = new Student("Thing Two");

        students.put("jbanana", joanna);
        students.put("notjbanana", notjoanna);
        students.put("thing1", thing1);
        students.put("thing2", thing2);

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.print(students.keySet());

        boolean moreStudents = false;
        do {
            System.out.println("Which GitHub user would you like more information on?");
            String chosen = scanner.nextLine();
            if(students.get(chosen) == null){
                System.out.println("That user does not exist.");
            }

            System.out.println("Would you like to see another user? [Y/N]");
            moreStudents = scanner.next().equalsIgnoreCase("y");
        } while(moreStudents);



    }
}
