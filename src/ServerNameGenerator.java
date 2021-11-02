
import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
//        Arrays.fill(noun, "quack");
//        System.out.println(Arrays.toString(noun));
        noun = new String[]{"apple", "pear", "orange", "peach", "navel", "grapefruit", "honeydew", "grapes", "watermelon", "strawberry", "blueberry" };

        for(int i = 0; i < adjectives.length; i++){
            adjectives[i] = "coolest" + i;
        }

        System.out.println("Your server is:\n" + randomElement(adjectives) + "-" + randomElement(noun));
    }

    public static String[] noun = new String[10];
    public static String[] adjectives = new String[10];

    public static String randomElement(String[] array){
        Random random = new Random();
        int element = random.nextInt(9+1);

        return array[element];
    }
}
