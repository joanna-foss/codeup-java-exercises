package groceries;

public class GroceriesArray {
    public static GroceryItem[] findAll() {
        return new GroceryItem[]{
                new GroceryItem("orange", "fruits", 2),
                new GroceryItem("asparagus", "vegetables"),
                new GroceryItem("birthday cake"),
                new GroceryItem("sparkling water", "beverages"),
                new GroceryItem("loaf of bread", "bakery", 3)
        };
    }
}
