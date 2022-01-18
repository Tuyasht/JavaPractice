package day30_ShortVideoPractices;

public class Circle {

    public double radius;                // 1 instance variable
    public static double pi = 3.14;      // 1 static variable

    public Circle(double radius) {       // constructor
        this.radius = radius;
    }

    public double calcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){          // 3 methods
        return 2 * radius * pi;
    }

    public static void printPI(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
