package String;

/*  https://www.geeksforgeeks.org/problems/cutting-binary-string1342/1  */

/*
You are given a binary string s consisting only of characters '0' and '1'. Your task is to split this string into the minimum number of non-empty substrings such that:

Each substring represents a power of 5 in decimal (e.g., 1, 5, 25, 125, ...).
No substring should have leading zeros.
Return the minimum number of such pieces the string can be divided into.
Note: If it is not possible to split the string in this way, return -1.

Examples:

Input: s = "101101101"
Output: 3
Explanation: The string can be split into three substrings: "101", "101", and "101", each of which is a power of 5 with no leading zeros.
Input: s = "1111101"
Output: 1
Explanation: The string can be split into one binary string "1111101" which is 125 in decimal and a power of 5 with no leading zeros.
Input: s = "00000"
Output: -1
Explanation: There is no substring that can be split into power of 5.
Constraints:
1 ≤ s.size() ≤ 30
* */




import java.util.*;

// Importing utility classes like Scanner, Set, HashSet, Arrays


public class CuttingBinaryString {

    // Function to calculate the minimum number of cuts needed
    // so that each resulting binary substring represents a power of 5.
    public static int cuts(String s) {
        // If string starts with '0', it's invalid (no power of 5 can start with 0)
        if (s.charAt(0) == '0') return -1;

        int n = s.length();
        int maxi = n + 1;  // A large value used to represent "infinity" (unreachable state)

        // Set to store all powers of 5 up to 10^9
        Set<Integer> powersOf5 = new HashSet<>();
        int val = 1;

        while (val <= 1_000_000_000) {
            powersOf5.add(val);  // Add current power of 5 to the set
            val *= 5;            // Move to next power of 5
        }

        // dp[i] will store the minimum cuts needed for substring starting from index i
        int[] dp = new int[n + 1];
        Arrays.fill(dp, maxi); // Initialize with "unreachable"
        dp[n] = 0;              // Base case: no cuts needed after the last character

        // Process the string from right to left
        for (int i = n - 1; i >= 0; --i) {

            // Skip if the current character is '0' (can't start a valid number)
            if (s.charAt(i) == '0') continue;

            int num = 0;

            // Form all possible substrings starting at index i
            for (int j = i; j < n; ++j) {
                // Build the number in decimal from binary string
                num = num * 2 + (s.charAt(j) == '1' ? 1 : 0);

                // If this number is a power of 5
                if (powersOf5.contains(num)) {
                    // Check if the rest of the string (j+1 to end) is also valid
                    if (dp[j + 1] != maxi) {
                        dp[i] = Math.min(dp[i], 1 + dp[j + 1]); // Update with minimum cuts
                    }
                }
            }
        }

        // If the result is still 'maxi', it means no valid split found
        return dp[0] >= maxi ? -1 : dp[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user how many test cases they want to run
        System.out.println("How many testcases do you want to run?");
        int n = sc.nextInt(), m = 1;

        // Loop through each test case
        while (n-- > 0) {
            System.out.println("Case #" + m++ + ":");
            System.out.println("Enter a Binary string:");
            String s = sc.next();

            // Output the minimum number of cuts
            System.out.println(cuts(s));
        }
    }
}

