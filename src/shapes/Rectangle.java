package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(double number) {
        this.length = number;
    }

    @Override
    public void setWidth(double number) {
        this.width = number;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    } //corrected during review with shanshan

    @Override
    public double getArea() {
        return this.length * this.width;
    }
//    protected int rectangleLength;
//    protected int rectangleWidth;
//
//    public Rectangle(int length, int width){
//        this.rectangleLength = length;
//        this.rectangleWidth = width;
//    }
//
//    public int getArea(){
//        return this.rectangleLength * this.rectangleWidth;
//    }
//
//    public int getPerimeter(){
//        return (2 * this.rectangleLength) + (2 * this.rectangleWidth);
//    }

}
