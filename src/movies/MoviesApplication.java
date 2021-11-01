package movies;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoviesApplication {
    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i].getName());
        }


//        System.out.println("What would you like to do?\n");
//        System.out.println("0 - exit");
//        System.out.println("1 - view all movies");
//        System.out.println("2 - view animated movies");
//        System.out.println("3 - view dramatic movies");
//        System.out.println("4 - view horrific movies");
//        System.out.println("5 - view scifi movies\n");
//
//        int choice = Input.getInt(0, 5);
//
//        switch(choice){
//            case 0:
//                System.out.println("Okay, later!");
//                break;
//            case 1:
//                System.out.println("case 1");
////                System.out.println(Arrays.toString(MoviesArray.findAll()));
//                break;
//            case 2:
//                System.out.println("case 2");
//                break;
//            case 3:
//                System.out.println("case 3");
//                break;
//            case 4:
//                System.out.println("case 4");
//                break;
//            case 5:
//                System.out.println("case 5");
//                break;
//            default:
//                System.out.println("Try again later.");
//        }

    }
}
