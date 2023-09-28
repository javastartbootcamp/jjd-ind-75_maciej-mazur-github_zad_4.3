package pl.javastart.task;

class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double calculateCircleArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
