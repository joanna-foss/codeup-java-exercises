package groceries;

public class GroceryItem {
    String item;
    String category;
    int quantity;

    public GroceryItem(){};

    public GroceryItem(String item){
        this.item = item;
        this.category = "miscellaneous";
        this.quantity = 1;
    };

    public GroceryItem(String item, String category){
        this.item = item;
        this.category = category;
        this.quantity = 1;
    };

    public GroceryItem(String item, String category, int quantity){
        this.item = item;
        this.category = category;
        this.quantity = quantity;
    };

    public void setCategory(String input){
        this.category = input;
    };

    public void setItem(String input){
        this.item = input;
    };

    public void setQuantity(int number){
        this.quantity = number;
    }

}
