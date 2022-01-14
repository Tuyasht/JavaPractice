package day38.ShapeTask;

public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length=length;
        this.width=width;
    }

    public double area(){
        return width * length;
    }
    public double perimeter(){
        return 2* (width+length);
    }

    @Override
    public String toString() {
        return super.toString()+
                "\t width=" + width+
                ", length=" + length;
    }
}
/*

Square
    s

    toString(): name, s, area, perimeter

Rectangle
    l
    w

    toString(): name, l, w, area, perimeter

 */