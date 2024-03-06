package ProblemThree;


public class Demo {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = {
            new Ellipse("MyEllipse", 5.0, 3.0),
            new Circle("MyCircle", 4.0),
            new Triangle("MyTriangle", 3.0, 4.0, 5.0),
            new EquilateralTriangle("MyEquilateralTriangle", 6.0)
        };

        // Print information about each shape using the overridden toString method
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
