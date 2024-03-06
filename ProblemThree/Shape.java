package ProblemThree;

abstract class Shape {
    protected String name; // Shape name

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstracts:
    abstract double calculatePerimeter();
    abstract double calculateArea();

    @Override
    // toString method:
    public String toString() {
        return "Shape: " + name + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}