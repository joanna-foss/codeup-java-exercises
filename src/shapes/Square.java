package shapes;

public class Square extends Rectangle {
    public int sides;

    public Square(int hooplah){
        super(hooplah, hooplah);
        this.sides = hooplah;
    }

    @Override
    public int getArea(){
        return 4 * this.sides;
    }

    @Override
    public int getPerimeter(){
        return (int) Math.pow(this.sides, 2);
    }
}
