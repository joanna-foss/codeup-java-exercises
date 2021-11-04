package Interfaces_Abstract_Lecture;

public class Company { //The Silver Dollar Saloon
    public static void main(String[] args) {
        Employee accountbot = new Accountant("accountbot", "accounting");
        Employee cleanerbot = new Custodian("cleanerbot", "facilities");

        System.out.println("bot.work() = " + accountbot.work());
        System.out.println("bot.getName() = " + accountbot.getName());
        System.out.println("bot.getDepartment() = " + accountbot.getDepartment());

        System.out.println("cleanerbot.work() = " + cleanerbot.work());
        System.out.println("cleanerbot.getName() = " + cleanerbot.getName());
        System.out.println("cleanerbot.getDepartment() = " + cleanerbot.getDepartment());

        System.out.println("cleanerbot.dailyPay() = " + cleanerbot.dailyPay());
    }
}
