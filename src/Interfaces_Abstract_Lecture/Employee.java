package Interfaces_Abstract_Lecture;

abstract class Employee implements DailyWork{
    //    protected - visibility modifier that allows us to share information between the super and subclasses but only between those two things.
    protected String name;
    protected String department;

    public Employee(String name, String department) { //Employee constructor
        this.name = name;
        this.department = department;
    }

    public String getName() { //method
        return name;
    }

    public String getDepartment() { //method
        return department;
    }

//    public abstract String work(); //used without implementation of interface.

//    public static void main(String[] args) {
//        Employee one = new Employee("WHAT", "WHAT"); //CANNOT INSTANTIATE - CTE (compile time error)
//    }
}

