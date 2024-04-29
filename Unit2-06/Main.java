/**
 * The main class for the program.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-24
 */

public class Main {
    /**
     * The main method for the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        Airplane biplane = new Airplane();
        int planeSpeed = biplane.setSpeed(212);
        System.out.println(planeSpeed);

        Jet boeing = new Jet();
        int jetSpeed = boeing.setSpeed(422);
        System.out.println(jetSpeed);

        for (int counter = 0; counter < 4; counter++) {
            int jetSpeed2 = boeing.accelerate(jetSpeed);
            System.out.println(boeing.getSpeed());
            if (jetSpeed < 5000) {
                jetSpeed = boeing.setSpeed(jetSpeed);
                System.out.println(jetSpeed);
            }
        }
        int planeSpeed2 = biplane.setSpeed(planeSpeed * 8);
        System.out.println(planeSpeed2);

        System.out.println("\nDone.");
    }
}