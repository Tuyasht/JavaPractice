package day38.ShapeTask;

public class Square extends Shape {

    public double side;

    public Square( double side) {
        super("Square");
        this.side = side;
    }
    public double area(){
        return side * side;
    }
    public double perimeter(){
        return  side * 4;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\t side=" + side;
    }
}
