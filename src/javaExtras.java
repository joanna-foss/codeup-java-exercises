import java.util.Scanner;

public class javaExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //SUPER SIMPLE CHAT BOT
        System.out.println("Hey, I finally have a visitor! What's you're name?");
        String name = scanner.nextLine();
        chatBot(name);
    }

    public static void chatBot(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, " + name);
        Boolean how = true;
        do {
            System.out.println("How are you? [good/bad]");
            String howGood = scanner.nextLine();
            if (howGood.equalsIgnoreCase("good")) {
                System.out.println("Awesome, my dude! Are you super extra happy?");
                Boolean superExtraHappy = scanner.nextLine().equalsIgnoreCase("yes");
                if (superExtraHappy) {
                    System.out.println("That's so amazing, my dude. You deserve it. Live it up!");
                } else {
                    System.out.println("That's okay. Sounds like you're having a great day anyway. :)");
                }
                how = false;
            } else if (howGood.equalsIgnoreCase("bad")) {
                System.out.println("Gah, I'm sorry to hear that. Would cake make it better?");
                Boolean cakeYes = scanner.nextLine().equalsIgnoreCase("yes");
                if (cakeYes) {
                    System.out.println("Sweet! Literally!! Here have some cake!");
                } else {
                    System.out.println("It's one of those days, huh? Well, I'm here to help if I can. You just let me know what I can do for you.");
                }
                how = false;
            } else {
                System.out.println("I don't understand your answer. Try again.");
            }
        } while (how);
    }
}
