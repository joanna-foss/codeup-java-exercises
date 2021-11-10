package java_fundamentals;

public class Cat extends Pet{
    private String color;

    public Cat(int catAge, boolean isCatRescue, String catName, String catColor){
        super(catAge, isCatRescue, catName);
        this.color = catColor;
    };

    public String getCatColor(){
        return this.color;
    }

    public String setCatColor(){

    }
}
