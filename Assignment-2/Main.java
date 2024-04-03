import java.util.Scanner;

/**
 * This program finds the largest run in a string.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-03
 */

final class Main {
    /**
     * Private constructor to prevent instantiation.
     */
    private Main() {
    }
    /**
     * The main method.
     *
     * @param args Unused
     * @throws IllegalStateException if this class is instantiated
     */

    static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        final String userInput = scanner.nextLine();

        final char[] userArray = userInput.toCharArray();
        int maxRun = 0;

        for (int counter = 0; counter < userArray.length; counter++) {
            int currentRun = 1;
            while (counter < userArray.length - 1
                            && userArray[counter] == userArray[counter + 1]) {
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

