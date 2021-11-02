public class Person {

    public static void main(String[] args) {

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
