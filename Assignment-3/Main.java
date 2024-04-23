/**
 * This is the Main() starting point.
 * 
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-23
 */

final class Main {
    /**
     * The main() method.
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println("Created a 3 mm by 4 mm by 5 mm triangle.");
        System.out.println("Is the triangle valid? " + triangle1.isValid());
        System.out.println("Semiperimeter: " + triangle1.semiPerimeter());
        System.out.println("Area: " + triangle1.area());
        System.out.println("Type: " + triangle1.getType());
        System.out.println("Angle 1: " + triangle1.angle(1));
        System.out.println("Angle 2: " + triangle1.angle(2));
        System.out.println("Angle 3: " + triangle1.angle(3));
        System.out.println("Height 1: " + triangle1.height(1));
        System.out.println("Height 2: " + triangle1.height(2));
        System.out.println("Height 3: " + triangle1.height(3));
        System.out.println("Inner circle radius: " + triangle1.innerCircleRadius());
        System.out.println("Circumcircle radius: " + triangle1.circumcircleRadius());

    }
}