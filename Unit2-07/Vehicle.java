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

    /**
     * This is the default constructor for the vehicle class.
     *
     * @param colour the colour
     */
    public Vehicle() {
        colour = "unknown";
        liscencePlate = "unknown";
        numDoors = 4;
        speed = 0;
        maxSpeed = 0;
    }

    /**
     * This is the constructor for the vehicle class.
     *
     * @param liscencePlate the liscence plate
     * @param numDoors the number of doors
     * @param maxSpeed the max speed
     */
    public Vehicle(String colour, String liscencePlate,
        int numDoors, int maxSpeed) {
        this.colour = colour;
        this.liscencePlate = liscencePlate;
        this.numDoors = numDoors;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
    }

    /**
     * This method gets the colour of the vehicle.
     *
     * @param colour the colour
     * @return String
     */
    public String getColour(String colour) {
        this.colour = colour;
        return this.colour;
    }

    /**
     * This method accelerates the vehicle.
     *
     * @param accelerationPowerd the acceleration power
     * @param accelerationTime the acceleration time
     * @return double
     */
    public double accelerate(double accelerationPowerd,
        double accelerationTime) {
        this.speed += accelerationPowerd * accelerationTime;
        return this.speed;
    }

    /**
     * This method brakes the vehicle.
     *
     * @param brakePower the brake power
     * @param brakeTime the brake time
     * @return double
     */
    public double brake(double brakePower, double brakeTime) {
        this.speed -= brakePower * brakeTime;
        return this.speed;
    }

    /**
     * This method gets the status of the vehicle.
     */
    public void status() {
        System.out.println("->Colour: " + colour);
        System.out.println("->Liscence Plate: " + liscencePlate);
        System.out.println("->Number of Doors: " + numDoors);
        System.out.println("->Speed: " + speed);
        System.out.println("->Max Speed: " + maxSpeed);
    }
}

