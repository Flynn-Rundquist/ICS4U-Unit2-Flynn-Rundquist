import java.util.Scanner;

/**
 * This program returns the longest run in a string.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-17
 */

final class Main {
    /**
    * The main() method.
    *
    * @null No return value
    */

    private Main() {
    // Private constructor to prevent instantiation
    }

    /**
     * The main method to execute the program.
     *
     * @param args The command-line arguments
     */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        final String inputStr = scanner.nextLine();

        if (inputStr.length() == 1) {
            System.out.println("Enter a string with more than one character.");
        } else {
            final int output = longestRun(inputStr);
            System.out.println("Longest run: " + output);
        }

        System.out.println("\nDone.");
        scanner.close();
    }

    /**
     * Calculates the longest run of adjacent characters in a string.
     *
     * @param inputString The input string
     * @return The length of the longest run
     */
    public static int longestRun(final String inputString) {
        int currentRun = 1;
        int longestRun = 1;
        int counter = 1;

        while (counter < inputString.length()) {
            if (inputString.charAt(counter)
                == inputString.charAt(counter - 1)) {
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

