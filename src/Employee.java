public class Employee extends Person{
    public static void main(String[] args) {
        Employee ken = new Employee("Ken");
        Person personKen = new Person("Ken");
        personKen.sayHello();
        ken.sayHello();
        System.out.println("ken.name = " + ken.getName());

        ken.doWork(); //this method is found in employee and will work with the object created in employee subclass.
//        personKen.doWork(); //cannot be found in person superclass. will not work.
    }

    public Employee(String name){
        super(name);
    }

    @Override
    public void sayHello(){
        System.out.println("Overridden HELLO");
    }

    public void doWork(){
        System.out.println("work. work. work.");
    }

    public int getAge(){
        return this.age;
    }
}
