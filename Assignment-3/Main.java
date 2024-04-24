/**
 * This is the Main() starting point.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-23
 */

class Main {
    /**
     * The main() method.
     *
     * @param args The command line arguments
     */

    static void main(String[] args) {

        final Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println("Created a 3 mm by 4 mm by 5 mm triangle.");
        System.out.println("Is the triangle valid? " + triangle1.isValid());
        System.out.printf("Semiperimeter: %.4f mm.\n", triangle1.semiPerimeter());
        System.out.printf("Area: %.4f mm^2.\n", triangle1.area());
        System.out.println("Type " + triangle1.getType());
        System.out.printf("Angle 1: %.4f rads.\n", triangle1.angle(1));
        System.out.printf("Angle 2: %.4f rads.\n", triangle1.angle(2));
        System.out.printf("Angle 3: %.4f rads.\n", triangle1.angle(3));
        System.out.printf("Height 1: %.4f mm.\n", triangle1.height(1));
        System.out.printf("Height 2: %.4f mm.\n", triangle1.height(2));
        System.out.printf("Height 3: %.4f mm.\n", triangle1.height(3));
        System.out.printf("Inner circle radius: %.4f mm\n", triangle1.innerCircleRadius());
        System.out.printf("Circumcircle radius: %.4f mm\n", triangle1.circumsCircleRadius());

        final Triangle triangle2 = new Triangle(3, 3,3);
        System.out.println("\nCreated a 3 mm by 3 mm by 3 mm triangle.");
        System.out.println("Is the triangle valid? " + triangle2.isValid());
        System.out.printf("Semiperimeter: %.4f mm.\n", triangle2.semiPerimeter());
        System.out.printf("Area: %.4f mm^2.\n", triangle2.area());
        System.out.println("Type " + triangle2.getType());
        System.out.printf("Angle 1: %.4f rads.\n", triangle2.angle(1));
        System.out.printf("Angle 2: %.4f rads.\n", triangle2.angle(2));
        System.out.printf("Angle 3: %.4f rads.\n", triangle2.angle(3));
        System.out.printf("Height 1: %.4f mm.\n", triangle2.height(1));
        System.out.printf("Height 2: %.4f mm.\n", triangle2.height(2));
        System.out.printf("Height 3: %.4f mm.\n", triangle2.height(3));
        System.out.printf("Inner circle radius: %.4f mm\n", triangle2.innerCircleRadius());
        System.out.printf("Circumcircle radius: %.4f mm\n", triangle2.circumsCircleRadius());

        final Triangle triangle3 = new Triangle(3, 4, 4);
        System.out.println("\nCreated a 3 mm by 4 mm by 4 mm triangle.");
        System.out.println("Is the triangle valid? " + triangle3.isValid());
        System.out.printf("Semiperimeter: %.4f mm.\n", triangle3.semiPerimeter());
        System.out.printf("Area: %.4f mm^2.\n", triangle3.area());
        System.out.println("Type " + triangle3.getType());
        System.out.printf("Angle 1: %.4f rads.\n", triangle3.angle(1));
        System.out.printf("Angle 2: %.4f rads.\n", triangle3.angle(2));
        System.out.printf("Angle 3: %.4f rads.\n", triangle3.angle(3));
        System.out.printf("Height 1: %.4f mm.\n", triangle3.height(1));
        System.out.printf("Height 2: %.4f mm.\n", triangle3.height(2));
        System.out.printf("Height 3: %.4f mm.\n", triangle3.height(3));
        System.out.printf("Inner circle radius: %.4f mm\n", triangle3.innerCircleRadius());
        System.out.printf("Circumcircle radius: %.4f mm\n", triangle3.circumsCircleRadius());

        final Triangle triangle4 = new Triangle(2,3,4);
        System.out.println("\nCreated a 2 mm by 3 mm by 4 mm triangle.");
        System.out.println("Is the triangle valid? " + triangle4.isValid());
        System.out.printf("Semiperimeter: %.4f mm.\n", triangle4.semiPerimeter());
        System.out.printf("Area: %.4f mm^2.\n", triangle4.area());
        System.out.println("Type " + triangle4.getType());
        System.out.printf("Angle 1: %.4f rads.\n", triangle4.angle(1));
        System.out.printf("Angle 2: %.4f rads.\n", triangle4.angle(2));
        System.out.printf("Angle 3: %.4f rads.\n", triangle4.angle(3));
        System.out.printf("Height 1: %.4f mm.\n", triangle4.height(1));
        System.out.printf("Height 2: %.4f mm.\n", triangle4.height(2));
        System.out.printf("Height 3: %.4f mm.\n", triangle4.height(3));
        System.out.printf("Inner circle radius: %.4f mm\n", triangle4.innerCircleRadius());
        System.out.printf("Circumcircle radius: %.4f mm\n", triangle4.circumsCircleRadius());

        final Triangle triangle5 = new Triangle(23,3,4);
        System.out.println("\nCreated a 23 mm by 3 mm by 4 mm triangle.");
        System.out.println("Is the triangle valid? " + triangle5.isValid());
        System.out.printf("Semiperimeter: %.4f mm.\n", triangle5.semiPerimeter());
        System.out.printf("Area: %.4f mm^2.\n", triangle5.area());
        System.out.println("Type " + triangle5.getType());
        System.out.printf("Angle 1: %.4f rads.\n", triangle5.angle(1));
        System.out.printf("Angle 2: %.4f rads.\n", triangle5.angle(2));
        System.out.printf("Angle 3: %.4f rads.\n", triangle5.angle(3));
        System.out.printf("Height 1: %.4f mm.\n", triangle5.height(1));
        System.out.printf("Height 2: %.4f mm.\n", triangle5.height(2));
        System.out.printf("Height 3: %.4f mm.\n", triangle5.height(3));
        System.out.printf("Inner circle radius: %.4f mm\n", triangle5.innerCircleRadius());
        System.out.printf("Circumcircle radius: %.4f mm\n", triangle5.circumsCircleRadius());

        System.out.println("\nDone.");

    }
}
