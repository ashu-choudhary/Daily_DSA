package Searching_Algo;

import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;

            }
            if (arr[mid] < key) {
                low = mid + 1;

            }
            if (arr[mid] > key) {
                high = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be searched: ");
        int key = sc.nextInt();

        if (binarySearch(arr, key) == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found in "+binarySearch(arr, key)+" position");
        }

    }

    
}
