package ProblemTwo;

public class Demo {
    public static void main(String[] args) {
        // Test Point class
        System.out.println("Testing Point class:");

        Point point1 = new Point(2.5f, 4.0f);
        System.out.println("Point 1: " + point1.toString());

        Point point2 = new Point();
        System.out.println("Point 2: " + point2.toString());

        // Test MoveablePoint class
        System.out.println("\nTesting MoveablePoint class:");

        MoveablePoint moveablePoint1 = new MoveablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("MoveablePoint 1: " + moveablePoint1.toString());

        MoveablePoint moveablePoint2 = new MoveablePoint();
        System.out.println("MoveablePoint 2: " + moveablePoint2.toString());

        // Test move() method
        System.out.println("\nTesting move() method:");

        // Move MoveablePoint 1 and display new position
        moveablePoint1.move();
        System.out.println("MoveablePoint 1 after move(): " + moveablePoint1.toString());

        // Move MoveablePoint 2 and display new position
        moveablePoint2.move();
        System.out.println("MoveablePoint 2 after move(): " + moveablePoint2.toString());

        // Move MoveablePoint 2 again and display new position
        moveablePoint2.move();
        System.out.println("MoveablePoint 2 after another move(): " + moveablePoint2.toString());
    }
}
