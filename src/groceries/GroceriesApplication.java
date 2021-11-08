package groceries;

import util.Input;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroceriesApplication {
    public static void main(String[] args) {
        createGroceryList();
    }

    public static void createGroceryList(){
        Map<String, Integer> produce = new TreeMap<>();
        Map<String, Integer> dairy = new TreeMap<>();
        Map<String, Integer> meat = new TreeMap<>();
        Map<String, Integer> beverages = new TreeMap<>();
        Map<String, Integer> cannedGoods = new TreeMap<>();
        Map<String, Integer> bakery = new TreeMap<>();
        Map<String, Integer> everythingElse = new TreeMap<>();

        boolean create = true;

        System.out.println("Hello, and welcome to the Grocery List App.");
        while(create) {
            int selection = selectAnOption();
            switch (selection) {
                case 0 -> { //display full grocery list - refactor opportunity
                    for(Map.Entry<String, Integer> entry : produce.entrySet()) System.out.println("Category: Produce || Item: " + entry.getKey() + " || Quantity: " + entry.getValue());
                    for(Map.Entry<String, Integer> entry : dairy.entrySet()) System.out.println("Category: Dairy || Item: " + entry.getKey() + " || Quantity: " + entry.getValue());
                    for(Map.Entry<String, Integer> entry : meat.entrySet()) System.out.println("Category: Meat || Item: " + entry.getKey() + " || Quantity: " + entry.getValue());
                    for(Map.Entry<String, Integer> entry : beverages.entrySet()) System.out.println("Category: Beverages || Item: " + entry.getKey() + " || Quantity: " + entry.getValue());
                    for(Map.Entry<String, Integer> entry : cannedGoods.entrySet()) System.out.println("Category: Canned Goods || Item: " + entry.getKey() + " || Quantity: " + entry.getValue());
                    for(Map.Entry<String, Integer> entry : bakery.entrySet()) System.out.println("Category: Bakery || Item: " + entry.getKey() + " || Quantity: " + entry.getValue());
                    for(Map.Entry<String, Integer> entry : everythingElse.entrySet()) System.out.println("Category: Everything Else || Item: " + entry.getKey() + " || Quantity: " + entry.getValue());
               }
                case 1 -> { //add item to grocery list
                    System.out.println("First, choose a category to add your item to: ");
                    displayCategories();
                    int categoryNum = input.getInt();

                    System.out.println("What is the item you'd like to add?");
                    String grocery = input.getString();

                    System.out.println("How many of these would you like to add?");
                    int quantity = input.getInt();

                    switch(categoryNum){ //refactor opportunity
                        case 1 -> {
                            produce.put(grocery, quantity);
                            System.out.println(produce);
                        }
                        case 2 -> {
                            dairy.put(grocery, quantity);
                            System.out.println(dairy);
                        }
                        case 3 -> {
                            meat.put(grocery, quantity);
                            System.out.println(meat);
                        }
                        case 4 -> {
                            beverages.put(grocery, quantity);
                            System.out.println(beverages);
                        }
                        case 5 -> {
                            cannedGoods.put(grocery, quantity);
                            System.out.println(cannedGoods);
                        }
                        case 6 -> {
                            bakery.put(grocery, quantity);
                            System.out.println(bakery);
                        }
                        case 7 -> {
                            everythingElse.put(grocery, quantity);
                            System.out.println(everythingElse);
                        }
                        default -> System.out.println("That's number isn't associated with any category!");
                    }

                }
                case 2 -> {
                    System.out.println("2"); //remove item method
                }
                case 3 -> {
                    System.out.println("3"); //search item method
                }
                case 4 -> { //display categories
                    displayCategories();
                }
                case 5 -> { //exit
                    System.out.println("Excellent! I hope you had fun. Bye bye now!");
                    return;
                }
                default -> {
                    System.out.println("I'm sorry. I wasn't able to understand your input.");
                }
            }
            System.out.println("Would you like to make another selection? [Y/N]");
            create = input.yesNo();
        }
        System.out.println("Excellent! I hope you had fun. Bye bye now!");
    }

    static Input input = new Input();

    public static int selectAnOption(){
        System.out.println("\nYou can choose from any of the following:");
        System.out.println("0 - Show Grocery List");
        System.out.println("1 - Add Item");
        System.out.println("2 - Remove Item");
        System.out.println("3 - Search for Item");
        System.out.println("4 - Show Categories");
        System.out.println("5 - Exit");
        System.out.println("What would you like to do? Please enter a number: ");
        return input.getInt();
    }

    public static void displayCategories(){
        System.out.println("These are the available categories in your grocery list:");
        System.out.println("(1) Produce");
        System.out.println("(2) Dairy");
        System.out.println("(3) Meat");
        System.out.println("(4) Beverages");
        System.out.println("(5) Canned Goods");
        System.out.println("(6) Bakery");
        System.out.println("(7) Everything Else");
    }
}
