/**
 * This is the standard Main() class starting point.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-03-22
 */

final class Main {
    /**
     * The main() method.
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        FlynnStack final fruits = new FlynnStack();
        fruits.push("apple");
        fruits.push("banana");
        fruits.push("cherry");
        System.out.println("Fruits: " + fruits.show());
        String removed = fruits.pop();
        System.out.println("Popped: " + removed);
        System.out.println("Fruits: " + fruits.show());
        System.out.println("\n");

        FlynnStack final colours = new FlynnStack();
        colours.push("red");
        colours.push("blue");
        colours.push("purple");
        System.out.println("Colours: " + colours.show());
        removed1 = colours.pop();
        System.out.println("Popped: " + removed1);
        System.out.println("Colours: " + colours.show());
        System.out.println("\n");

        FlynnStack final animals = new FlynnStack();
        animals.push("dog");
        animals.push("bird");
        animals.push("cat");
        System.out.println("Animals: " + animals.show());
        removed2 = animals.pop();
        System.out.println("Popped: " + removed2);
        System.out.println("Animals: " + animals.show());

        System.out.println("\nDone.");
    }
}
