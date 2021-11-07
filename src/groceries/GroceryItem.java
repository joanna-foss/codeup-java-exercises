package groceries;

public class GroceryItem {
    String item;
    String category;
    int quantity;

    public GroceryItem(){};

//    public GroceryItem(String item){
//        this.item = item;
//        this.category = "miscellaneous";
//        this.quantity = 1;
//    };
//
//    public GroceryItem(String item, String category){
//        this.item = item;
//        this.category = category;
//        this.quantity = 1;
//    };

    public GroceryItem(String item, String category, int quantity){
        this.item = item;
        this.category = category;
        this.quantity = quantity;
    };

    public void setCategory(int number){
        switch (number) {
            case 1 -> this.category = "Produce";
            case 2 -> this.category = "Dairy";
            case 3 -> this.category = "Meat";
            case 4 -> this.category = "Beverages";
            case 5 -> this.category = "Canned Goods";
            case 6 -> this.category = "Bakery";
            default -> this.category = "Everything Else";
            //the arrow usage here -> eliminates the need for break; after each case
            //if fall-through is needed, use case:
            //otherwise, use case ->
        }
    };

    public void setItem(String input){
        this.item = input;
    };

    public void setQuantity(int number){
        this.quantity = number;
    }

}
