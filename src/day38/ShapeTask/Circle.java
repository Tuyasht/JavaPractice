package day38.ShapeTask;

public class Circle extends Shape {

    public double r;
    public static double pi = 3.14;
    public Circle( double r ) {
        super("Circle");
        this.r = r;
    }

   public double area(){
        return r * r * pi;
   }
   public double perimeter(){
        return r*pi*2;
   }

    @Override
    public String toString() {
        return super.toString()+
                "\t radius ='" + r +
                " PI ='" + pi;
    }

}

