/**
 * The FlynnStack class.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-03-22
 */

final class FlynnStack {
    /**
     * Private constructor prevents instantiation of this class.
     */
    private String[] stack;

    /**
     * Constructor.
     *
     * @param size The size of the stack
     */
    FlynnStack(int size) {
        stack = new String[size];
    }

    /**
     * Method to push an item.
     *
     * @param item The item
     */
    public void push(String item) {
        for (int counter = 0; counter < stack.length; counter++) {
            if (stack[counter] == null) {
                stack[counter] = item;
                break;
            }
        }
    }

    /**
     * Method to show the stack.
     *
     * @return The stack
     */
    public String show() {
        String output = "";
        for (int counter = 0; counter < stack.length; counter++) {
            if (stack[counter] != null) {
                output += stack[counter] + ", ";
            }
        }
        if (!output.isEmpty()) {
            output = output.substring(0, output.length() - 2);
        }
        return output;
    }
}

