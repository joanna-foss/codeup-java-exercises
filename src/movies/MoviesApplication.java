package movies;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoviesApplication {
    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        Input test = new Input();

        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view animated movies");
        System.out.println("3 - view dramatic movies");
        System.out.println("4 - view horrific movies");
        System.out.println("5 - view scifi movies");
        System.out.println("6 - view comedy movies\n");

        int choice = test.getInt(0, 6);

        switch(choice){
            case 0:
                System.out.println("Okay, later!");
                break;
            case 1:
                for (int i = 0; i < movies.length; i++) {
                    System.out.println("Title: " + movies[i].getName() + " || Category: " + movies[i].getCategory());
                }
                break;
            case 2:
                for (int i = 0; i < movies.length; i++) {
                    if(movies[i].getCategory().equalsIgnoreCase("animated")) {
                        System.out.println("Title: " + movies[i].getName() + " || Category: " + movies[i].getCategory());
                    } else {
                        continue;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < movies.length; i++) {
                    if(movies[i].getCategory().equalsIgnoreCase("drama")) {
                        System.out.println("Title: " + movies[i].getName() + " || Category: " + movies[i].getCategory());
                    } else {
                        continue;
                    }
                }
                break;
            case 4:
                for (int i = 0; i < movies.length; i++) {
                    if(movies[i].getCategory().equalsIgnoreCase("horror")) {
                        System.out.println("Title: " + movies[i].getName() + " || Category: " + movies[i].getCategory());
                    } else {
                        continue;
                    }
                }
                break;
            case 5:
                for (int i = 0; i < movies.length; i++) {
                    if(movies[i].getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println("Title: " + movies[i].getName() + " || Category: " + movies[i].getCategory());
                    } else {
                        continue;
                    }
                }
                break;
            case 6:
                for (int i = 0; i < movies.length; i++) {
                    if(movies[i].getCategory().equalsIgnoreCase("comedy")) {
                        System.out.println("Title: " + movies[i].getName() + " || Category: " + movies[i].getCategory());
                    } else {
                        continue;
                    }
                }
                break;
            default:
                System.out.println("Try again later.");
        }
    }
}
