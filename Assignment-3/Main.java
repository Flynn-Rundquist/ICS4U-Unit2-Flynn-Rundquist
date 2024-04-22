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
        System.out.println("The semi-perimeter of the triangle is: " + triangle1.semiPerimeter());
        System.out.println("The area of the triangle is: " + triangle1.area());
        System.out.println("The type of the triangle is: " + triangle1.getType());
        System.out.println("The first angle of the triangle is: " + triangle1.angle(1));
        System.out.println("The second angle of the triangle is: " + triangle1.angle(2));
        System.out.println("The third angle of the triangle is: " + triangle1.angle(3));

        Triangle triangle2 = new Triangle(3, 3, 3);

    }
}