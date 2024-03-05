package ProblemThree;

class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * (2 * Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2) - Math.abs(majorAxis - minorAxis));
    }

    @Override
    double calculateArea() {
        return Math.PI * majorAxis * minorAxis;
    }
}
