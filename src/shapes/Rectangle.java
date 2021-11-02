package shapes;

public class Rectangle {
    protected int rectangleLength;
    protected int rectangleWidth;

    public Rectangle(int length, int width){
        this.rectangleLength = length;
        this.rectangleWidth = width;
    }

    public Rectangle(int lengthWidth){
        this.rectangleLength = lengthWidth;
        this.rectangleWidth = lengthWidth;
    }

    public int getArea(){
        return this.rectangleLength * this.rectangleWidth;
    }

    public int getPerimeter(){
        return (2 * this.rectangleLength) + (2 * this.rectangleWidth);
    }
}
