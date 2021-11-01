import java.util.Scanner;

public class Candy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What candy bar are you buying?\n");
        String candy = scanner.nextLine();
        System.out.printf("A %s! What size are you buying?\n", candy);
        String size = scanner.nextLine();

        Candy(candy, size);
    }

    public static void Candy(String name, String size){
        System.out.printf("Ahhh, a %s! I see that you got the %s of it. Sounds good! :)", name, size);
    }
}

