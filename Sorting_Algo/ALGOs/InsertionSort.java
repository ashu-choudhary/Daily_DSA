package Sorting_Algo.ALGOs;

public class InsertionSort {

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;

            }
            arr[j + 1] = key;

        }
    }

    public static void main(String[] args) {
        int[] arr = { 45, 5, 65, 7, 8, 95 };

        insertionSort(arr);

        for (int j : arr) {
            System.out.print(j + " ");

        }

    }
}
