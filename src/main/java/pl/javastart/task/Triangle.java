package pl.javastart.task;

class Triangle {
    private double segmentA;
    private double segmentB;
    private double segmentC;

    Triangle(double segmentA, double segmentB, double segmentC) {
        this.segmentA = segmentA;
        this.segmentB = segmentB;
        this.segmentC = segmentC;
    }

    double getSegmentA() {
        return segmentA;
    }

    double getSegmentB() {
        return segmentB;
    }

    double getSegmentC() {
        return segmentC;
    }

    double calculateTrianglePerimeter() {
        return segmentA +
                segmentB +
                segmentC;
    }
}
