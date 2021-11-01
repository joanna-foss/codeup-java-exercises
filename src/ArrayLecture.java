public class ArrayLecture {
    public static void main(String[] args) {
        double[] prices = new double[4];
        System.out.println("prices length: " + prices.length);

        final int numOfSides = 6;
        int[] diceSides = new int[numOfSides];
        System.out.println("diceSides.length: " + diceSides.length);
        System.out.println("The default value of any non-specified int array object: " + diceSides[0]);

        String[] mybag = {"Snickers", "Reese's", "Brussel Sprouts"};
        System.out.println("The length of mybag: " + mybag.length);
        System.out.println("3rd item in my bag: " + mybag[2]);
    }
}
