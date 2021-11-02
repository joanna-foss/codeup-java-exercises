import java.util.Arrays;

public class ArrayLecture {
    public static void main(String[] args) {
        double[] prices = new double[4];
//        System.out.println("prices length: " + prices.length);

        final int numOfSides = 6;
        int[] diceSides = new int[numOfSides];
//        System.out.println("diceSides.length: " + diceSides.length);
//        System.out.println("The default value of any non-specified int array object: " + diceSides[0]);

        String[] mybag = {"Snickers", "Reese's", "Brussel Sprouts", "Skittles"};
//        System.out.println("The length of mybag: " + mybag.length);
//        System.out.println("3rd item in my bag: " + mybag[2]);

//        for (int i = 0; i<mybag.length; i++){
//            System.out.println((i+1) + ". " + mybag[i]);
//        };

//        for(String candy : mybag){ //this is Java's forEach loop! Saves us time.
//            System.out.println(candy);
//        }

        String[] anotherBag = new String[12];
//        System.out.println("anotherBag[0] = " + anotherBag[0]); //null is the default value of a non-specified string object
//
//        Arrays.fill(anotherBag, "Snickers");
//        for(String candy : anotherBag){
//            System.out.println(candy);
//        }

//        System.out.println(Arrays.equals(mybag, anotherBag));

        String[] myBagPlusTwo = Arrays.copyOf(mybag, mybag.length + 2);
//        System.out.println(myBagPlusTwo.length);
        for(String item : myBagPlusTwo){
            System.out.println(item);
        }

        //This does not work vvvvv - revisit -- revisited; needed to sort mybag first.
        Arrays.sort(mybag);
        int skittlesindex = Arrays.binarySearch(mybag, "Skittles");
        int snickersindex = Arrays.binarySearch(mybag, "Snickers");
//
        System.out.println("Here are some Skittles: " + mybag[skittlesindex]);
        System.out.println("Here are some Snickers: " + mybag[snickersindex]);

        int[][] matrix = {
            {1, 2, 3}, //arr1
            {4, 5, 6}, //arr2
            {7, 8, 9}  //arr3 . . these three arrays are ELEMENTS of the outer array
        };

        for(int[] row: matrix){
            System.out.println("+---+---+---+");
            System.out.print("| ");
            for(int n : row){
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");

        System.out.println("matrix[0] = " + Arrays.toString(matrix[0]));
    }
}
