import util.Input;

import java.util.Arrays;
import java.util.Scanner;

//my version of this warmup
public class Candy {
/**Write a public class named ‘Candy’
* this class should have two public fields,
* both taking in a string literal as a value.
* The first would be ‘name’ and the second will be ‘size’.
* The class will also need two constructors:
* - the first for if we know the name, but not the size.
* Your first constructor should set some kind of string literal for the size.
* - The second would be for if we know both the name and the size.
* This second constructor will pass through those arguments into the Candy object being instantiated.
* BONUS:
* Write a method for your Candy class - this method should print out a message saying:
* “Ahhh, a [name]! I see that you got the [size] of it. Sounds good! :)”**/

    public String candy;
    public String size;
    public String[] descriptors;

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        Candy candy1 = new Candy("Twix");
        Candy candy2 = new Candy("PayDay", "King");

        candy1.displayInfo();
        candy2.displayInfo();

        String[] strTest = new String[] {"test1", "test2", "test3",};
        Candy candy3 = new Candy("Snickers", "Fun", strTest);
        candy3.displayInfo();
//        System.out.println(Arrays.toString(candy3.descriptors));
        candy3.displayCandyDescriptors();
    }

    public Candy(String name){
        this.candy = name;
        this.size = "undecided";
    }

    public Candy(String name, String chosen){
        this.candy = name;
        this.size = chosen;
    }

    public Candy(String name, String chosen, String[] description){
        this.candy = name;
        this.size = chosen;
        this.descriptors = description;
    }

    public void displayInfo(){
        System.out.printf("Ahh, a %s! I see that you got the %s of it. Sounds good! :)\n", this.candy, this.size);
    }

    public void displayCandyDescriptors(){
        System.out.printf("%s, %s, %s", this.candy, this.size, Arrays.toString(this.descriptors));
    }
}

