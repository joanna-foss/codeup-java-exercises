import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();
        test.getInt();
        System.out.println("Are you a happy person?");
        System.out.println(test.yesNo()); //issues with this not taking scanner input

    }
}
