package pl.javastart.task;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(3, 4, 5);
        Square square = new Square(5);

        System.out.printf(Locale.US,"%.2f%n", circle.calculateCircleArea());
        System.out.println(rectangle.calculateRectPerimeter());
        System.out.println(triangle.calculateTrianglePerimeter());
        System.out.println(square.calculateSquareArea());
    }
}
