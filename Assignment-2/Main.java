import java.util.Scanner;

final class Main {

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
                counter++; // Increment counter to move to the next character
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
