public class Person {
    public String name;
    public static void main(String[] args) {
//        Person ken = new Person();

        //instance variables
//        ken.firstName = "Ken";
//        ken.lastName = "Howell";

//        System.out.println("ken = " + ken); //<-- this is the location of where ken is
//        System.out.println(ken.firstName + " " + ken.lastName + " is my name!");
//        System.out.printf("%s %s is my name!%n", ken.firstName, ken.lastName);
//
//        System.out.println(ken.joinChat());

//        Person douglas = new Person();
//        douglas.firstName = "Douglas";
//        douglas.lastName = "Hirsch";

//        System.out.println("worldPop with Douglas :D = " + worldPop);
//        System.out.println(douglas.worldPop);

        //Can we talk to Person.firstName??
//        System.out.println(Person.firstName); //CTE - compile time error;
    }

    public String firstName;
    public String lastName;

    //instance method
    public String joinChat(){
        return lastName + ", " + firstName + " has joined the chat!";
    }

    //static
    public static long worldPop = 7_900_000_000L;

    public Person(String name){
        this.name = name;
    }; //this is a default constructor.

    public void sayHello(){
        System.out.printf("Hello %s!%n", this.name);
    }

    public String getName(){
        return this.name;
    }

}
