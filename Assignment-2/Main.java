/**
 * This program returns the longest run in a string.
 * 
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-17
 */

import java.util.Scanner;

public class LongestRun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        
        if (inputStr.length() == 1) {
            System.out.println("Enter a string with more than one character.");
        } else {
            int output = longestRun(inputStr);
            System.out.println("Longest run: " + output);
        }

        System.out.println("\nDone.");
        scanner.close();
    }

    public static int longestRun(String inputString) {
        int currentRun = 1; // Length of the current run
        int longestRun = 1; // Length of the longest run found so far
        int counter = 1; // Counter to iterate through the string

        while (counter < inputString.length()) {
            if (inputString.charAt(counter) == inputString.charAt(counter - 1)) {
                // Increment the current run length if the current character matches the previous one
                currentRun++;
            } else {
                // Reset the current run length if the current character doesn't match the previous one
                currentRun = 1;
            }

            // Update the longest run if the current run is longer
            if (currentRun > longestRun) {
                longestRun = currentRun;
            }

            counter++;
        }

        return longestRun;
    }
}
