package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input thingy = new Input();

        do {
            System.out.println("Enter in a radius between 5 and 10: ");
            double userInput = thingy.getDouble(5.0, 10.0);
            System.out.println(userInput);

            Circle circle1 = new Circle(userInput);
            System.out.println(circle1.getArea());
            System.out.println(circle1.getCircumference());
            System.out.println(circle1.getRadius());

            System.out.println("Would you like to create more circles?!");
            ; //why isn't this giving me the option to have user input
        } while(thingy.yesNo());
    }
}
