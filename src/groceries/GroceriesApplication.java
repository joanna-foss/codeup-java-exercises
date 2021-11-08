package groceries;

import util.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroceriesApplication {
    public static void main(String[] args) {
        createGroceryList();
    }

    public static void createGroceryList(){
        Map<String, Integer> produce = new HashMap<>();
        Map<String, Integer> dairy = new HashMap<>();
        Map<String, Integer> meat = new HashMap<>();
        Map<String, Integer> beverages = new HashMap<>();
        Map<String, Integer> cannedGoods = new HashMap<>();
        Map<String, Integer> bakery = new HashMap<>();
        Map<String, Integer> everythingElse = new HashMap<>();
//        HashMap<String, Integer> myGroceries = Map.of();

        boolean create = true;

        System.out.println("Hello, and welcome to the Grocery List App.");
        while(create) {
            int selection = selectAnOption();
            switch (selection) {
                case 0 -> {
//                    if (myGroceries.isEmpty()) {
//                        System.out.println("Your list is empty!");
//                    } else {
                    sort(dairy);
//                        System.out.println(myGroceries); //will display location as is. Address this later.
//                    }
                }
                case 1 -> {
                    //add item method
                    System.out.println("First, choose a category to add your item to: ");
                    displayCategories();
                    int categoryNum = input.getInt();

                    System.out.println("What is the item you'd like to add?");
                    String grocery = input.getString(); //something is happening here...

                    System.out.println("How many of these would you like to add?");
                    int quantity = input.getInt();

                    switch(categoryNum){
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
                            System.out.println(dairy);
                        }
                        case 4 -> {
                            beverages.put(grocery, quantity);
                            System.out.println(dairy);
                        }
                        case 5 -> {
                            cannedGoods.put(grocery, quantity);
                            System.out.println(dairy);
                        }
                        case 6 -> {
                            bakery.put(grocery, quantity);
                            System.out.println(dairy);
                        }
                        case 7 -> {
                            everythingElse.put(grocery, quantity);
                            System.out.println(dairy);
                        }
                        default -> System.out.println("default");
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
                case 5 -> {
                    System.out.println("Excellent! I hope you had fun. Bye bye now!");
                    return;
                }
                default -> {
                    System.out.println("I'm sorry. I wasn't able to understand your input.");
                }
            }
            System.out.println("Would you like to make another selection? [Y/N]");
            create = input.yesNo();
        };
    };

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

//    public static <K, V> Map<K, V> convertHashToTree(Map<K, V> category){
//        Map<K, V> itemsSorted = new TreeMap<>();
//        category.putAll(itemsSorted);
//        return itemsSorted;
//    }
    public static void sort(Map<String, Integer> Cat){
        Map<String, Integer> map = new TreeMap<>(Cat);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " || " + entry.getValue());
        }
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
