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

        joanna.addGrade(90);
        joanna.addGrade(80);
        notjoanna.addGrade(100);
        notjoanna.addGrade(0);
        thing1.addGrade(10);
        thing1.addGrade(20);
        thing2.addGrade(200);
        thing2.addGrade(400);

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.println(students.keySet());

        boolean moreStudents = false;
        do {
            System.out.println("Which GitHub user would you like more information on?");
            String chosen = scanner.next(); //does not work with nextLine()... what is the difference between next() and nextLine()?
            Student current = students.get(chosen);
            if(current == null){
                System.out.println("That user does not exist.");
            } else {
                System.out.println("Name: " + current.getName() + " - GitHub Username: " + chosen);
                System.out.println("Current average: " + current.getGradeAverage());
            }
            System.out.println("Would you like to see another user? [Y/N]");
            moreStudents = scanner.next().equalsIgnoreCase("y");
        } while(moreStudents);

        System.out.println("Goodbye.");
    }
}
