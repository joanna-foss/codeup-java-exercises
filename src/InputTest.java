import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();
//        System.out.println("Are you a happy person?");
//        boolean result = test.yesNo();
        System.out.println("Enter an integer: ");
        System.out.println(test.getInt());

        System.out.println("Enter a double: ");
        System.out.println(test.getDouble());

        System.out.println("Enter in a binary num: ");
        System.out.println(test.getBinary());

        System.out.println("Enter in a hexidecimal num: ");
        System.out.println(test.getHex());
    }
}
