package shapes;

import util.Input;

public class Circle {
    private double radius;
//    private double area;
//    private double circumference;
    public Circle(double radius) {
        this.radius = radius;
    //        this.area = getArea();
    //        this.circumference = getCircumference();
    }

    public double getCircumference(){
//        double radius = this.radius;
        return radius * Math.PI * 2;
    }



    public double getArea(){
//        double radius = this.radius;
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius(){
        return radius;
    }
}
