package Interfaces_Abstract_Lecture;

public class Accountant extends Employee { //ACCOUNTANT is the subclass and EMPLOYEE is the superclass.
    public String work(){
          return "working on TPS reports";
    }

    public String morningMeeting(){
        return "morningMeeting - accountant";
    }

    public String lunchTime(){
        return "lunchTime - accountant";
    }

    public int dailyPay(){
        return 1;
    }

    public Accountant(String name, String department){
        super(name, department);
    }
}
