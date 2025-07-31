package Searching_Algo.QUESTIONs;

//https://www.geeksforgeeks.org/problems/find-repetitive-element-from-1-to-n-1/1

/*
Given an array arr[] of size n, filled with numbers from 1 to n-1 in random order.
The array has only one repetitive element.
Your task is to find the repetitive element.

Note: It is guaranteed that there is a repeating element present in the array.

Examples:

Input: arr[] = [1, 3, 2, 3, 4]
Output: 3
Explanation: The number 3 is the only repeating element.
Input: arr[] = [1, 5, 1, 2, 3, 4]
Output: 1
Explanation: The number 1 is the only repeating element.
Input: arr[] = [1, 1]
Output: 1
Explanation: The array is of size 2 with both elements being 1, making 1 the repeating element.


Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ n-1

*/
public class FindOnlyRepetitiveElement {

    public static void main(){
        int[] arr = {3,1,2,5,4,2};

        System.out.println(findduplicate(arr));
    }


    static int findduplicate(int[] arr){
        int n = arr.length;
        int res = 0;

        for(int i=0;i<n-1;i++){
            res = res ^ (i+1) ^ arr[i];
        }

        res = res ^ arr[n-1];

        return res;
    }
}
