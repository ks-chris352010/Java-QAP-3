package ProblemThree;

class Triangle extends Shape {
    private double side1; // Side one
    private double side2; // Side two
    private double side3; // Side three

    // Constructor:
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (!isValidTriangle(side1, side2, side3)) {
            System.err.println("Invalid triangle sides. Exiting program.");
            System.exit(1);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Triangle check:
    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && b + c > a && c + a > b;
    }

    // Overridden calculating methods:
    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
