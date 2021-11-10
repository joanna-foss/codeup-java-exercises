package java_fundamentals;

public class Pet {
    private int age;
    private boolean isRescue;
    private String name;

//    public Pet(){};

    public Pet(int petAge, boolean petIsRescue, String petName) {
        age = petAge;
        isRescue = petIsRescue;
        name = petName;
    }

    public int getAge(){
        return this.age;
    }

    public boolean getRescue(){
        return this.isRescue;
    }

    public String getName(){
        return this.name;
    }
}
