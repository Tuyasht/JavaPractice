package day38.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);

        System.out.println(circle);

        Square square = new Square(5.5);
        System.out.println(square);

        Rectangle rectangle = new Rectangle(4.7, 6.9);
        System.out.println(rectangle);

    }
}
