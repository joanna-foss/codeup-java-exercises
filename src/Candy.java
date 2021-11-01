import java.util.Scanner;
//my version of this warmup
public class Candy {
    public static String candy;
    public static String size;

    public static void main(String[] args) {
        Candy candy1 = new Candy("Twix");
        Candy candy2 = new Candy("PayDay", "King");
        System.out.println(candy1.displayInfo());
        System.out.println(candy2.displayInfo());
    }

    public Candy(String name){
        candy = name;
        size = "undecided";
    }

    public Candy(String name, String chosen){
        candy = name;
        size = chosen;
    }

    public String displayInfo(){
        return String.format("Ahh, a %s! I see that you got the %s of it. Sounds good! :)", candy, size);
    }
}

