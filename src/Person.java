public class Person {
    //The class should have a constructor that accepts a `String` value and sets
    //the person's name to the passed string.
    //
    //Create a `main` method on the class that creates a new `Person` object and
    //tests the above methods.
    public static void main(String[] args) {
//        Person joanna = new Person("Joanna");
//        System.out.println(joanna.getName());
//        joanna.sayHello();

//        joanna.setName("lady");
//        System.out.println(joanna.getName());
//        joanna.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true comparing string match
//        System.out.println(person1 == person2); //false comparing exact match

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); //John
        System.out.println(person2.getName()); //John
        person2.setName("Jane"); // ***review what's happening here***
        System.out.println(person1.getName()); //John - no. Jane
        System.out.println(person2.getName()); //Jane

    }

    private String name; //private field also considered a property (name is property)

    public Person(String personName){
        this.name = personName;
    }
    //GETTERS AND SETTERS is the way to get indirect access to private fields.
    public String getName(){   //would call using .getName(); would only call this on an object which is an instance of this particular class.
    //TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
    //TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s!", this.name);
    }
}
