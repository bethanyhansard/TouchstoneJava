import java.util.InputMismatchException;
import java.util.Scanner;

// Class for a basic calculator program
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        int userChoice; // Variable to store the user's choice

        // Display menu and perform selected operation until the user chooses to exit
        do {
            // Display menu options
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            try {
                userChoice = scanner.nextInt(); // Read user's choice

                // Perform corresponding operation based on user's choice
                switch (userChoice) {
                    case 1:
                        performAddition(scanner); // Perform addition operation
                        break;
                    case 2:
                        performSubtraction(scanner); // Perform subtraction operation
                        break;
                    case 3:
                        performMultiplication(scanner); // Perform multiplication operation
                        break;
                    case 4:
                        performDivision(scanner); // Perform division operation
                        break;
                    case 5:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                // Handle invalid input (non-integer input)
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input to prevent an infinite loop
                userChoice = 0; // Reset userChoice to 0 to continue the loop
            }
        } while (userChoice != 5); // Continue until the user chooses to exit

        scanner.close(); // Close the scanner to release resources
    }

    // Method to perform addition operation
    public static void performAddition(Scanner scanner) {
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble(); // Read first number
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble(); // Read second number
        double result = num1 + num2; // Perform addition
        System.out.println("Result: " + result); // Display result
    }

    // Method to perform subtraction operation
    public static void performSubtraction(Scanner scanner) {
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble(); // Read first number
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble(); // Read second number
        double result = num1 - num2; // Perform subtraction
        System.out.println("Result: " + result); // Display result
    }

    // Method to perform multiplication operation
    public static void performMultiplication(Scanner scanner) {
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble(); // Read first number
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble(); // Read second number
        double result = num1 * num2; // Perform multiplication
        System.out.println("Result: " + result); // Display result
    }

    // Method to perform division operation
    public static void performDivision(Scanner scanner) {
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble(); // Read first number
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble(); // Read second number
        if (num2 != 0) {
            double result = num1 / num2; // Perform division
            System.out.println("Result: " + result); // Display result
        } else {
            System.out.println("Error: Division by zero!"); // Handle division by zero
        }
    }
}
