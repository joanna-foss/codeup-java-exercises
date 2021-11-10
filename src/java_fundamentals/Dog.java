package java_fundamentals;

public class Dog extends Pet{
    private String breed;

    public Dog(int dogAge, boolean dogIsRescue, String dogName, String dogBreed){
        super(dogAge, dogIsRescue, dogName);
        this.breed = dogBreed;
    }

    public String getDogBreed(){
        return this.breed;
    }

    public String setDogBreed(String newBreed){
        this.breed = newBreed;
    }
}
