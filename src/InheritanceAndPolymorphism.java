public class InheritanceAndPolymorphism {
    public static void main(String[] args) {
        Worker one = new Worker();
        Worker oneM = new Manager();

        doWork(one);
        doWork(oneM);

    }

    public static void doWork(Worker worker){
        System.out.println("worker.work() = " + worker.work());
    };

    //november 2nd lecture with ken on inheritance and polymorphism.
    //inheritance.
    //create employee class that extends person class.

    // public Employee(String employeeName){
    //   super(employeeName)
    // }

    //create superhero class that extends person class.
    // public SuperHero(String birthName, String alterEgo){
    //
    // }

    //polymorphism.
    //treats objects of different subclasses with the same superclass as if they were of the superclass type.
    //create worker class and manager class which is a subclass of worker.
}
