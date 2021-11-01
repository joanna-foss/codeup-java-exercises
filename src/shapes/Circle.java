package shapes;

import util.Input;

public class Circle {
    private double radius;

    public double getCircumference(){
        return radius * Math.PI * 2;
    }

    public Circle(double radius){
        double area = getArea();
        double circumference = getCircumference();
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
