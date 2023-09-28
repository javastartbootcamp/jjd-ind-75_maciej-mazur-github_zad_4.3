package pl.javastart.task;

class Triangle {
    private double segmentA;
    private double segmentB;
    private double segmentC;

    public Triangle(double segmentA, double segmentB, double segmentC) {
        this.segmentA = segmentA;
        this.segmentB = segmentB;
        this.segmentC = segmentC;
    }

    public double getSegmentA() {
        return segmentA;
    }

    public double getSegmentB() {
        return segmentB;
    }

    public double getSegmentC() {
        return segmentC;
    }
}
