/**
 * The FlynnStack class
 * 
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-03-22
 */

public class FlynnStack {
    // array to store strings
    private String[] stack;
    
    // constructor
    public FlynnStack(int size) {
        stack = new String[size];
    }
    
    // push method
    public void push(String item) {
        for (int counter = 0; counter < stack.length; counter++) {
            if (stack[counter] == null) {
                stack[counter] = item;
                break;
            }
        }
    }

    // method to show the stack
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
