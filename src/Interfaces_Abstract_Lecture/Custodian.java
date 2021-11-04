package Interfaces_Abstract_Lecture;

public class Custodian extends Employee{
    public String work(){
        return "Maintaining, cleaning, general custodianing...";
    }

    public String morningMeeting(){
        return "morningMeeting - custodian";
    };

    public String lunchTime(){
        return "lunch - custodian";
    }

    public int dailyPay(){
        return 0;
    }

    public Custodian(String name, String department){
        super(name, department);
    }
}
