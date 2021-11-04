package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape1 = new Square(9);
        Measurable myShape2 = new Rectangle(2, 2);

        System.out.println("myShape1.getArea() = " + myShape1.getArea());
        System.out.println("myShape1.getPerimeter() = " + myShape1.getPerimeter());
//        Rectangle box1 = new Rectangle(4, 5);
//
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getArea() = " + box2.getArea());
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
    }
}
