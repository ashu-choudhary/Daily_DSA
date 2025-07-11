
/*

/////////          USING  DOUBLE  SWITCH  FUNCTION        /////////////

package EXTRA;

import java.util.Scanner;

public class Calculator {

    // Method to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to perform subtraction
    public static double sub(double a, double b) {
        return a - b;
    }

    // Method to perform multiplication
    public static double mul(double a, double b) {
        return a * b;
    }

    // Method to perform division with zero-check
    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return a; // Returning original value if division is not possible
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        System.out.println("Simple Calculator");

        double a, b, RES = 0; // Variable declarations

        // Step 1: Get initial two numbers from the user
        System.out.print("Enter first number: ");
        a = sc.nextDouble();

        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        // Ask user for the operation to perform
        System.out.print("Enter operation to perform (add/sub/mul/div): ");
        String operation = sc.next().toLowerCase(); // Convert to lowercase for uniformity

        // Step 2: Perform the selected operation on a and b
        switch (operation) {
            case "add":
                RES = add(a, b);
                break;
            case "sub":
                RES = sub(a, b);
                break;
            case "mul":
                RES = mul(a, b);
                break;
            case "div":
                RES = div(a, b);
                break;
            default:
                System.out.println("Invalid operation! Exiting.");
                return; // Exit program if invalid operation entered
        }

        // Show initial result
        System.out.println("Result: " + RES);

        // Step 3: Loop for performing more operations
        while (true) {
            System.out.print("Perform more actions? Yes (1) / No (0): ");
            int choice = sc.nextInt();
            if (choice == 0) break; // Exit loop if user enters 0

            // Ask user for next operation and number
            System.out.print("Enter operation to perform (add/sub/mul/div): ");
            operation = sc.next().toLowerCase();

            System.out.print("Enter number: ");
            double n = sc.nextDouble();

            // Perform selected operation using the current result
            switch (operation) {
                case "add":
                    RES = add(RES, n);
                    break;
                case "sub":
                    RES = sub(RES, n);
                    break;
                case "mul":
                    RES = mul(RES, n);
                    break;
                case "div":
                    RES = div(RES, n);
                    break;
                default:
                    System.out.println("Invalid operation!");
                    continue; // Skip to next iteration if operation is invalid
            }

            // Show current result after operation
            System.out.println("Current Result: " + RES);
        }

        // Final output after all operations
        System.out.println("Final Result: " + RES);

        sc.close(); // Close scanner to avoid resource leak
    }
}

*/


/* ////////        USING  DOUBLE  SWITCH  FUNCTION       ////////   */


package EXTRA;

import java.util.Scanner;

public class Calculator {

    // Method to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to perform subtraction
    public static double sub(double a, double b) {
        return a - b;
    }

    // Method to perform multiplication
    public static double mul(double a, double b) {
        return a * b;
    }

    // Method to perform division with a check for division by zero
    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return a; // Return the same value if division is not possible
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to read input
        System.out.println("Simple Calculator");

        double RES = 0;         // Variable to store the running result
        boolean isFirst = true; // Flag to check if it's the first input

        // Start the calculator loop
        while (true) {
            double num;
            String operation;

            // For the first time, ask user to enter the first number only
            if (isFirst) {
                System.out.print("Enter first number: ");
                RES = sc.nextDouble(); // Store it in result
                isFirst = false;       // Set flag to false after first input
            }

            // Ask user to enter an operation
            System.out.print("Enter operation to perform (add/sub/mul/div): ");
            operation = sc.next().toLowerCase(); // Convert to lowercase to make it case-insensitive

            // Ask user to enter the next number to operate with current result
            System.out.print("Enter next number: ");
            num = sc.nextDouble();

            // Perform the selected operation using a single switch case
            switch (operation) {
                case "add":
                    RES = add(RES, num);
                    break;
                case "sub":
                    RES = sub(RES, num);
                    break;
                case "mul":
                    RES = mul(RES, num);
                    break;
                case "div":
                    RES = div(RES, num);
                    break;
                default:
                    System.out.println("Invalid operation! Please try again.");
                    continue; // Skip result print if invalid operation
            }

            // Show the current result after operation
            System.out.println("Current Result: " + RES);

            // Ask user if they want to continue
            System.out.print("Perform more actions? Yes (1) / No (0): ");
            int choice = sc.nextInt();
            if (choice == 0) break; // Exit if user chooses 0
        }

        // Final result after all operations
        System.out.println("Final Result: " + RES);

        // Close the scanner to avoid resource leak
        sc.close();
    }
}


