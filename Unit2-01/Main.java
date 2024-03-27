/**
 * This is the standard Main() class starting point.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-03-22
 */

public class Main {
    /**
     * The main() method.
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        FlynnStack fruits = new FlynnStack();
        fruits.push("apple");
        fruits.push("banana");
        fruits.push("cherry");
        System.out.println("Fruits: " + fruits.show());

        FlynnStack colours = new FlynnStack();
        colours.push("red");
        colours.push("blue");
        colours.push("purple");
        System.out.println("Colours: " + colours.show());

        FlynnStack animals = new FlynnStack();
        animals.push("dog");
        animals.push("bird");
        animals.push("cat");
        System.out.println("Animals: " + animals.show());

        System.out.println("\nDone.");
    }
}
