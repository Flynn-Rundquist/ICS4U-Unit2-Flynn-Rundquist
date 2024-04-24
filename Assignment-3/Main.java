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
        System.out.println("Semiperimeter: %.4f " + triangle1.semiPerimeter() + " mm.");
        System.out.println("Area: %.4f " + triangle1.area() + " mm^2.");
        System.out.println("Type " + triangle1.getType());
        System.out.println("Angle 1: %.4f " + triangle1.angle(1) + " rads.");
        System.out.println("Angle 2: %.4f " + triangle1.angle(2) + " rads.");
        System.out.println("Angle 3: %.4f " + triangle1.angle(3) + " rads.");
        System.out.println("Height 1: %.4f " + triangle1.height(1) + " mm.");
        System.out.println("Height 2: %.4f " + triangle1.height(2) + " mm.");
        System.out.println("Height 3: %.4f " + triangle1.height(3) + " mm.");
        System.out.println("Inner circle radius: %.4f " + triangle1.innerCircleRadius() + " mm.");
        System.out.println("Circumcircle radius: %.4f " + triangle1.circumsCircleRadius() + " mm.");
        System.out.println("\n");

        System.out.println("\nDone.");

    }
}