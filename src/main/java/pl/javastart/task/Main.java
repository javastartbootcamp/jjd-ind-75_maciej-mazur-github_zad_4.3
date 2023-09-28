package pl.javastart.task;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.printf(Locale.US,"%.2f%n", shapeCalculator.calculateCircleArea(new Circle(5)));
        System.out.println(shapeCalculator.calculateRectPerimeter(new Rectangle(5, 10)));
        System.out.println(shapeCalculator.calculateTrianglePerimeter(new Triangle(3, 4, 5)));
        System.out.println(shapeCalculator.calculateSquareArea(new Square(5)));
    }
}
