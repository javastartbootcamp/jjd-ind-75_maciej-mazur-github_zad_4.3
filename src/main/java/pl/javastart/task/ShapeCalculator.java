package pl.javastart.task;

class ShapeCalculator {
    double calculateSquareArea(Square square) {
        return Math.pow(square.getSide(), 2);
    }

    double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getSegmentA() +
                triangle.getSegmentB() +
                triangle.getSegmentC();
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return 2 * rectangle.getSideA() + 2 * rectangle.getSideB();
    }

}
