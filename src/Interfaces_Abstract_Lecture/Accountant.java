package Interfaces_Abstract_Lecture;

public class Accountant extends Employee { //ACCOUNTANT is the subclass and EMPLOYEE is the superclass.
    public String work(){
          return "working on TPS reports";
    }

    public Accountant(String name, String department){
        super(name, department);
    }
}
