package pl.javastart.task;

class Rectangle {
    private double sideA;
    private double sideB;

    Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double getSideA() {
        return sideA;
    }

    double getSideB() {
        return sideB;
    }

    double calculateRectPerimeter() {
        return 2 * sideA + 2 * sideB;
    }
}
