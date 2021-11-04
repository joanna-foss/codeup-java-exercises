package games;

import java.util.Scanner;

public class Player {
    public String name;
    public int gamesWon;

    public Player(){}

    public Player(String input){
        this.name = input;
    }
    public void addWin(){
        gamesWon += 1;
    }

    public void setName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        this.name = scanner.nextLine();
    }
}
