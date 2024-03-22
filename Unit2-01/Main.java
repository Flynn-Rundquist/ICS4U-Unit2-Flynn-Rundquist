/**
 * This is the standard Main() class starting point.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-03-22
 */
public class Main {
    public static void main(String[] args) {
        FlynnStack fruits = new FlynnStack(3);
        fruits.push("apple");
        fruits.push("banana");
        fruits.push("cherry");
        System.out.println(fruits.show());

        FlynnStack colours = new FlynnStack(3);
        colours.push("red");
        colours.push("blue");
        colours.push("purple");
        System.out.println(colours.show());

        FlynnStack animals = new FlynnStack(3);
        animals.push("dog");
        animals.push("bird");
        animals.push("cat");
        System.out.println(animals.show());

        System.out.println("\nDone.");
    }
}
