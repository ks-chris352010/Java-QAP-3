package ProblemFour;

public class Demo {
    public static void main(String[] args) {
        // Shape array:
        Scalable[] scalables = {
            new Ellipse("MyEllipse", 5.0, 3.0),
            new Circle("MyCircle", 4.0),
            new Triangle("MyTriangle", 3.0, 4.0, 5.0),
            new EquilateralTriangle("MyEquilateralTriangle", 6.0)
        };

        // Prints out shape info before scaling:
        System.out.println("Before Scaling:");
        for (Scalable scalable : scalables) {
            System.out.println(scalable.toString());
        }

        // Scale the shapes:
        scaleAll(scalables, 1.5);

        // Prints out shape info after scaling:
        System.out.println("\nAfter Scaling:");
        for (Scalable scalable : scalables) {
            System.out.println(scalable.toString());
        }
    }

    // Static method to scale all Scalable objects in the array
    public static void scaleAll(Scalable[] scalables, double scaleFactor) {
        for (Scalable scalable : scalables) {
            scalable.scale(scaleFactor);
        }
    }
}
