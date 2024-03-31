/**
* The FlynnStack class.
*
* @author Flynn Rundquist
* @version 1.0
* @since 2024-03-22
*/

final class FlynnStack {

    /**
     * The main() method.
     *
     * @param args The command line arguments
     */
    private String[] stack;

    /**
     * Creates an empty stack.
     */
    FlynnStack() {
        stack = new String[0];
    }

    /**
     * Pushes an item onto the stack.
     *
     * @param item The item to push
     */
    public void push(String item) {
        String[] final newStack = new String[stack.length + 1];
        for (int counter = 0; counter < stack.length; counter++) {
            newStack[counter] = stack[counter];
        }
        newStack[newStack.length - 1] = item;
        stack = newStack;
    }

    /**
     * Pops an item off the stack.
     *
     * @return The item
     */
    public String pop() {
        String final top_item = stack[stack.length - 1];
        String[] final newStack = new String[stack.length - 1];
        for (int counter = 0; counter < newStack.length; counter++) {
            newStack[counter] = stack[counter];
        }
        stack = newStack;
        return top_item;
    }

    /**
     * Shows the stack.
     *
     * @return The stack
     */
    public String show() {
        String values = "";
        for (int counter = 0; counter < stack.length; counter++) {
            values += stack[counter];
            if (counter < stack.length - 1) {
                values += ", ";
            }
        }
        values += "";
        return values;
    }
}
