package ProblemThree;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double calculatePerimeter();

    abstract double calculateArea();

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}