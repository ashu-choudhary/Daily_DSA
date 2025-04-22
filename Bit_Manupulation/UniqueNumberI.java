package Bit_Manupulation;

//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/bit-manipulation-gfg-160/problem/find-unique-number

/*

Given a unsorted array arr[] of positive integers having all the numbers occurring exactly twice, except for one number which will occur only once. Find the number occurring only once.

Examples :

Input: arr[] = [1, 2, 1, 5, 5]
Output: 2
Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.
Input: arr[] = [2, 30, 2, 15, 20, 30, 15]
Output: 20
Explanation: Since 20 occurs once, while other numbers occur twice, 20 is the answer.

*/



public class UniqueNumberI {
    public static void main(){
        int[] arr= {1,4,1,3,4,2,3};


        System.out.println(findunique(arr));
    }

    static int findunique(int[] arr){
        int ans = 0;

        for (int j : arr) {
            ans ^= j;

        }

        return ans;
    }
}
