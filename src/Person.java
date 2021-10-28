public class Person {
    public static void main(String[] args) {
        Person ken = new Person();

        ken.firstName = "Ken";
        ken.lastName = "Howell";

        System.out.println("ken = " + ken); //<-- this is the location of where ken is
        System.out.println(ken.firstName + " " + ken.lastName + " is my name!");
        System.out.printf("%s %s is my name!%n", ken.firstName, ken.lastName);

        System.out.println(ken.joinChat());
    }

    public String firstName;
    public String lastName;
    public int age;

    //instance method
    public String joinChat(){
        return lastName + ", " + firstName + " has joined the chat!";
    };
}
