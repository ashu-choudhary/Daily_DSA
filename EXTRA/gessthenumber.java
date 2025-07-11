package EXTRA;

import java.util.*;

public class gessthenumber {

    // Function to handle the guessing game logic
    public static String nogess(double n) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        // Allow the user to guess up to 3 times
        while (i++ < 3) {
            System.out.println("Guess a Number");
            int num = sc.nextInt(); // User input

            // Check if guessed number matches the target
            if (num == n) {
                return "You WIN"; // If matched, return win
            }
        }

        // If all attempts fail, return loss
        return "You LOSE";
    }

    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random number between 1 and 100
        int n = random.nextInt(100) + 1;

        // Show prompt (but note: prompt says 1–10, fix it if needed)
        System.out.println("Guess a Number Between 1 and 100"); // Updated message

        // (Optional) Uncomment the next line to hide the answer in real gameplay
        System.out.println(n); // Shows the random number (used for debugging)

        // Start the guessing game and display the result
        System.out.println(nogess(n) + " Number is " + n);
    }
}
