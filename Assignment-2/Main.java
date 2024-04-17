/**
 * This program returns the longest run in a string.
 * 
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-17
 */

import java.util.Scanner;

public class Main {
    /**
     * The main() method
     * 
     * @param args The command-line arguments
     */

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
        int currentRun = 1;
        int longestRun = 1;
        int counter = 1;

        while (counter < inputString.length()) {
            if (inputString.charAt(counter) == inputString.charAt(counter - 1)) {
                currentRun++;
            } else {
                currentRun = 1;
            }

            if (currentRun > longestRun) {
                longestRun = currentRun;
            }

            counter++;
        }

        return longestRun;
    }
}
