
//https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1

/*
Given a non-negative integer n, your task is to find the nth Fibonacci number.

The Fibonacci sequence is a sequence where the next term is the sum of the previous two terms.
The first two terms of the Fibonacci sequence are 0 followed by 1.
The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

The Fibonacci sequence is defined as follows:

F(0) = 0
F(1) = 1
F(n) = F(n - 1) + F(n - 2) for n > 1
Examples :

Input: n = 5
Output: 5
Explanation: The 5th Fibonacci number is 5.
Input: n = 0
Output: 0
Explanation: The 0th Fibonacci number is 0.
Input: n = 1
Output: 1
Explanation: The 1st Fibonacci number is 1.
Constraints:
0 ≤ n ≤ 30
*/



package DP;

import java.util.*;

public class Memoization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no for find Fibonacci number: ");
        int n = sc.nextInt();

        System.out.println(fabonaci(n));
    }

    static int fabonaci(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);

        return resfabonaci(n,memo);
    }

    static int resfabonaci(int n, int[] memo) {
        if(n <= 1) return n;

        if(memo[n] != -1) return memo[n];

        memo[n] = resfabonaci(n-1,memo)+resfabonaci(n-2,memo);

        return memo[n];
    }
}
