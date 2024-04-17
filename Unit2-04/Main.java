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
        FlynnStack fruits = new FlynnStack();
        fruits.push("apple");
        fruits.push("banana");
        fruits.push("cherry");
        System.out.println("Fruits: " + fruits.show());
        System.out.println("Is the stack empty? " + fruits.isEmpty());
        System.out.println("The size of the stack is: " + fruits.size());
        String removed = fruits.pop();
        System.out.println("Popped: " + removed);
        System.out.println("Fruits: " + fruits.show());
        System.out.println("Is the stack empty? " + fruits.isEmpty());
        System.out.println("Top item: " + fruits.peekItem());
        System.out.println("The size of the stack is: " + fruits.size());
        System.out.println("Emptying the stack...");
        fruits.clearStack();
        System.out.println("Fruits: " + fruits.show());
        System.out.println("Is the stack empty? " + fruits.isEmpty());
        System.out.println("\n");

        FlynnStack colours = new FlynnStack();
        colours.push("red");
        colours.push("blue");
        colours.push("purple");
        System.out.println("Colours: " + colours.show());
        System.out.println("Is the stack empty? " + colours.isEmpty());
        System.out.println("The size of the stack is: " + colours.size());
        Float final removed1 = colours.pop();
        System.out.println("Popped: " + removed1);
        System.out.println("Top item: " + colours.peekItem());
        System.out.println("Colours: " + colours.show());
        System.out.println("The size of the stack is: " + colours.size());
        System.out.println("Emptying the stack...");
        colours.clearStack();
        System.out.println("Colours: " + colours.show());
        System.out.println("Is the stack empty? " + colours.isEmpty());
        System.out.println("\n");

        FlynnStack animals = new FlynnStack();
        animals.push("dog");
        animals.push("bird");
        animals.push("cat");
        System.out.println("Animals: " + animals.show());
        System.out.println("Is the stack empty? " + animals.isEmpty());
        System.out.println("The size of the stack is: " + animals.size());
        String removed2 = animals.pop();
        System.out.println("Popped: " + removed2);
        System.out.println("Top item: " + animals.peekItem());
        System.out.println("Animals: " + animals.show());
        System.out.println("The size of the stack is: " + animals.size());
        System.out.println("Emptying the stack...");
        animals.clearStack();
        System.out.println("Animals: " + animals.show());
        System.out.println("Is the stack empty? " + animals.isEmpty());

        System.out.println("\nDone.");
    }
}
