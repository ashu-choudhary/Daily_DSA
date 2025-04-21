package EXTRA;

public class GenerateBinaryNumbers {
    public static void generateBinary(int n, String number) {
        // Base case: If the number length reaches n, print it
        if (number.length() == n) {
            System.out.println(number);
            return;
        }

        // Recursive case: Add '0' and '1' to the current number
        generateBinary(n, number + "0");
        generateBinary(n, number + "1");
    }

    public static void main(String[] args) {
        int n = 3; // Change this to generate binary numbers of different lengths
        generateBinary(n, "");
    }
}

