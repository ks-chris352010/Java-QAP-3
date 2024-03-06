package ProblemThree;


public class Demo {
    public static void main(String[] args) {
        // Shape array:
        Shape[] shapes = {
            new Ellipse("MyEllipse", 5.0, 3.0),
            new Circle("MyCircle", 4.0),
            new Triangle("MyTriangle", 3.0, 4.0, 5.0),
            new EquilateralTriangle("MyEquilateralTriangle", 6.0)
        };

        // Prints out shape info:
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
