public class Arithmetic {

    //static fields
    //a static property:
    public static double pi = 3.14159;

    public static void main(String[] args) {
        //Do NOT do this with "static"
//        Arithmetic myMath = new Arithmetic();
//        System.out.println(myMath.pi); //still works but WRONG way to do it... do THIS instead:
        System.out.println(Arithmetic.pi);

        //static methods:
        System.out.println(Arithmetic.add(2, 2));
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
