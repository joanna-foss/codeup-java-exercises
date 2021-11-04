package shapes;

public class Square extends Quadrilateral {

    public Square(int number) {
        super(number, number);
    }

    @Override
    public double getPerimeter() {
        return (2*this.length) + (2*this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double number) {
        this.length = number;
    }

    @Override
    public void setWidth(double number) {
        this.width = number;
    }
}
