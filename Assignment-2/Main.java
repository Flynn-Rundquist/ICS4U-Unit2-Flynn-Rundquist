/**
 * This program returns the largest run in an array.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-03
 */

import java.util.Scanner;

/**
 * Utility class.
 */
final class Main {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String userInput = scanner.nextLine();

    char[] userArray = userInput.toCharArray();
    int maxRun = 0;

    for (int counter = 0; counter < userArray.length; counter++) {
        int currentRun = 1;
        while (counter < userArray.length - 1 && userArray[counter] == userArray[counter + 1]) {
            currentRun++;
        }
        if (currentRun > maxRun) {
            maxRun = currentRun;
        }
    }

    System.out.println("The largest run is: " + maxRun);
    System.out.println("\nDone.");
    scanner.close();
    }
}
