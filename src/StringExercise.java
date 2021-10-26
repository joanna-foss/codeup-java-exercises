import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. String Basics
        String weDontNeed = "We don't need no education";
        System.out.println(weDontNeed + "\n" + weDontNeed.replace("no education", "no thought control"));

        String checkIt = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(checkIt);

        String windowsDrive = "In windows, the main drive is usually C:\\";
        System.out.println(windowsDrive);

        String backslashes = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(backslashes);
    }
}
