/**
 * This is the Main() class.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-18
 */

final class Main {
    /**
     * The main() method.
     */
    private Main() {
        // Prevent instantiation
    }

    /**
     * This is the main method.
     *
     * @param args
     */
    public static void main(String[] args) {
        Vehicle fordFocus = new Vehicle("white", "AB40-C4RR0", 4, 284);
        System.out.println("Created Ford Focus");
        System.out.println("Status:");
        fordFocus.status();

        System.out.println("Accelerating, 10 of power for 10 sec.");
        System.out.println("New speed: " + fordFocus.accelerate(10, 10));

        System.out.println("Changing colour to black.");
        System.out.println("New colour: " + fordFocus.getColour("black"));
        System.out.println("\n");

        Vehicle ferrari = new Vehicle("red", "VHD-35HU", 2, 320);
        System.out.println("\nCreated Ferrari");
        System.out.println("Status:");
        ferrari.status();

        System.out.println("Accelerating, 100 of power for 4 sec.");
        System.out.println("New speed: " + ferrari.accelerate(100, 4));

        System.out.println("Braking, 10 of power for 10 sec.");
        System.out.println("New speed: " + ferrari.brake(10, 10));

        System.out.println("Changing color:");
        System.out.println("New colour: " + ferrari.getColour("racing red!"));
        System.out.println("\n");

        Vehicle citroen = new Vehicle("blue", "C1TR0-3N", 2, 45);
        System.out.println("\nCreated Citroen Ami");
        System.out.println("Status:");
        citroen.status();

        System.out.println("Accelerating, 5 of power for 10 sec.");
        System.out.println("New speed: " + citroen.accelerate(5, 10));

        System.out.println("Braking, 2 of power for 10 sec.");
        System.out.println("New speed: " + citroen.brake(2, 10));

        System.out.println("Changing color:");
        System.out.println("New colour: " + citroen.getColour("purple"));

        System.out.println("\nDone.");

    }
}