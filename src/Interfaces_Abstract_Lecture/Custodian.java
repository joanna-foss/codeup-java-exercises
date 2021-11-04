package Interfaces_Abstract_Lecture;

public class Custodian extends Employee{
    public String work(){
        return "Maintaining, cleaning, general custodianing...";
    }

    public Custodian(String name, String department){
        super(name, department);
    }
}
