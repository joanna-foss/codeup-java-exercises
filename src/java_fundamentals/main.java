package java_fundamentals;

public class main {
    public static void main(String[] args) {
//        int[] arrayNums = new int[]{1, 3, 4, 2, 6, 5, 8, 7};
//        System.out.println("cubed(5) = " + cubed(5));
//        System.out.println("difference(3, 2) = " + difference(3, 2));
//        System.out.println("difference(4.5, 3.9) = " + difference(4.5, 3.9));
//        System.out.println("median(arrayNums) = " + median(arrayNums));

        Pet pete = new Pet(4, true, "pete");
        System.out.println("pete = " + pete);
        System.out.println("pete.getName() = " + pete.getName());
        System.out.println("pete.getAge() = " + pete.getAge());
        System.out.println("pete.getRescue() = " + pete.getRescue());

        Cat jasmine = new Cat(3, false, "jasmine", "orange");
        System.out.println("jasmine = " + jasmine);
        System.out.println("jasmine.getName() = " + jasmine.getName());
        System.out.println("jasmine.getAge() = " + jasmine.getAge());
        System.out.println("jasmine.getRescue() = " + jasmine.getRescue());
        System.out.println("jasmine.getCatColor() = " + jasmine.getCatColor());
    }

    public static int cubed(int num){
        return (int) Math.pow(num, 3);
    }

    public static int difference(int num1, int num2){
        return num1 - num2;
    }

    public static double difference(double num1, double num2){
        return num1 - num2;
    }

    public static double median(int[] arrayofInts){
        int total = 0;
        for(int i = 0; i < arrayofInts.length; i++){
            total += arrayofInts[i];
        }
        return (double) total/arrayofInts.length;
    }
}
