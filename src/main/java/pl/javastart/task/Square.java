package pl.javastart.task;

class Square {
    private double side;

    Square(double side) {
        this.side = side;
    }

    double getSide() {
        return side;
    }

    double calculateSquareArea() {
        return Math.pow(side, 2);
    }
}
