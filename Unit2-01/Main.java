/**
 * This is the standard Main() class starting point.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-03-22
 */
final class Main {
    /**
     * This is the standard Main() class starting point.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        FlynnStack<Stack> fruits = new FlynnStack<>();
        fruits.push("apple");
        fruits.push("banana");
        fruits.push("cherry");
        System.out.println(fruits.show());

        FlynnStack<Stack> colours = new FlynnStack<>();
        colours.push("red");
        colours.push("blue");
        colours.push("purple");
        System.out.println(colours.show());

        FlynnStack<Stack> animals = new FlynnStack<>();
        animals.push("dog");
        animals.push("bird");
        animals.push("cat");
        System.out.println(animals.show());

        System.out.println("\nDone.");
    }
}

