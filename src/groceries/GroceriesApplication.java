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
        System.out.println(groceries.isEmpty());
        System.out.println("Hello, and welcome to the Grocery List App.");
        int selection = showOptions();
        switch (selection){
            case 1:
                if(groceries.isEmpty()){
                    System.out.println("Your list is empty!");
                } else {
                    System.out.println(groceries); //will display location as is. Address this later.
                }
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            default:
                System.out.println("default");

        }

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

    public static int showOptions(){
        Input input = new Input();
        System.out.println("\nYou can choose from any of the following:");
        System.out.println("0 - Show Grocery List");
        System.out.println("1 - Add Item");
        System.out.println("2 - Remove Item");
        System.out.println("3 - Search for Item");
        System.out.println("4 - Exit");
        System.out.println("What would you like to do? Please enter a number: ");
        return input.getInt();
    }
}
