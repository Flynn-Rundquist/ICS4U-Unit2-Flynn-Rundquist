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

        public static void main(String[] args) {

            Triangle triangle1 = new Triangle(3, 4, 5);
            System.out.println("Created a 3 mm by 4 mm by 5 mm triangle.");
            System.out.println("Is the triangle valid? " + triangle1.isValid());
            System.out.printf("Semiperimeter: %.4f mm.", triangle1.semiPerimeter());
            System.out.printf("Area: %.4f mm^2.", triangle1.area());
            System.out.println("Type: " + triangle1.getType());
            System.out.printf("Angle 1: %.4f rads.", triangle1.angle(1));
            System.out.printf("Angle 2: %.4f rads.", triangle1.angle(2));
            System.out.printf("Angle 3: %.4f rads.", triangle1.angle(3));
            System.out.printf("Height 1: %.4f mm.", triangle1.height(1));
            System.out.printf("Height 2: %.4f mm.", triangle1.height(2));
            System.out.printf("Height 3: %.4f mm.", triangle1.height(3));
            System.out.printf("Inner circle radius: %.4f mm.", triangle1.innerCircleRadius());
            System.out.printf("Circumcircle radius: %.4f mm.", triangle1.circumsCircleRadius());
    }
}