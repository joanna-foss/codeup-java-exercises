package groceries;

import util.Input;

import java.util.HashMap;

public class GroceriesApplication {
    public static void main(String[] args) {
        createGroceryList();
    }

    public static void createGroceryList(){
        Input input = new Input();
//        GroceryItem[] groceries = GroceriesArray.findAll();
        HashMap<Integer, GroceryItem> groceries = new HashMap<>();
        System.out.println("Hello, and welcome to the Grocery List App.");
        System.out.println("Would you like to create a grocery list? [Y/N]");
        boolean makeList = input.getString().equalsIgnoreCase("y");
        while(makeList){
            boolean wantAddItem;
            do{
                GroceryItem current = new GroceryItem();
                System.out.println("Choose a category:\n(1) Fruits\n(2) Veggies\n(3) Bakery");
                int category = input.getInt();
                System.out.println("Enter the name of your item: ");
                String currentItem = input.getString();
                System.out.println("How many of these do you want?");
                int numOfItem = input.getInt();

                System.out.println("Would you like to add another item to your list? [Y/N]");
                wantAddItem = input.getString().equalsIgnoreCase("y");
            } while(wantAddItem);
//            System.out.println(groceries);
            System.out.println("Would you like to create another grocery list?");
            makeList = input.getString().equalsIgnoreCase("y");
        };
    };
}
