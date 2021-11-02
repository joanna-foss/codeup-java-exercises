package shapes;

public class Square extends Rectangle {
    public Square(int side){
        super(side, side);
    }

    @Override
    public int getArea(){
        return 4 * this.rectangleLength;
    }

    @Override
    public int getPerimeter(){
        return (int) Math.pow(this.rectangleLength, 2);
    }
}
