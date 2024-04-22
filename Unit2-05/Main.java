/**
 * This is the Main() class.
 * 
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-18
 */

final class Main {
    private Main() {
        // Prevent instantiation
    }

    public static void main(String[] args) {
        Vehicle fordFocus = new Vehicle("white", "AB40-C4RR0", 4, 284);
        System.out.println("Created Ford Focus");
        System.out.println("Status:");
        fordFocus.status();

        System.out.println("Accelerating, 10 of power for 10 sec.");
        fordFocus.accelerate(10, 10);
        System.out.println("New speed: " + fordFocus.speed);

        System.out.println("Changing colour to black.")
        fordFocus.colour = "black";
        System.out.println("New colour: " + fordFocus.colour);

        Vehicle ferrari = new Vehicle('red', 'VHD-35HU', 2, 320)
        System.out.println("Created Ferrari");
        System.out.println("Status:");
        ferrari.status();

        System.out.println("Accelerating, 100 of power for 4 sec.");
        ferrari.accelerate(100, 4);
        System.out.println("New speed: " + ferrari.speed);

        System.out.println("Braking, 10 of power for 10 sec.");
        ferrari.brake(10, 10);
        System.out.println("New speed: " + ferrari.speed);

        System.out.println("Changing color:");
        ferrari.colour = "racing red";

    }
}