/**
 * This is the vehicle class.
 * 
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-18
 */

public class Vehicle {
    private String colour;
    private String liscencePlate;
    private int numDoors;
    private int speed;
    private int maxSpeed;

    public Vehicle() {
        colour = "unknown";
        liscencePlate = "unknown";
        numDoors = 4;
        speed = 0;
        maxSpeed = 0;
    }

    public Vehicle(String colour, String liscencePlate, int numDoors, int maxSpeed) {
        this.colour = colour;
        this.liscencePlate = liscencePlate;
        this.numDoors = numDoors;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
    }

    public double accelerate(double accelerationPowerd, double accelerationTime) {
        this.speed += accelerationPowerd * accelerationTime;
        return this.speed;
    }

    public double brake(double brakePower, double brakeTime) {
        this.speed -= brakePower * brakeTime;
        return this.speed;
    }

    public void status() {
        System.out.println("Colour: " + colour);
        System.out.println("Liscence Plate: " + liscencePlate);
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Speed: " + speed);
        System.out.println("Max Speed: " + maxSpeed);
    }
}

