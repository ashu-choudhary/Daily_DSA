package Sorting_Algo;

public class SelectionSort {

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;

                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

    }
    public static void main(String[] args) {

        int[] arr = { 2, 45, 6, 1, 8, 77 };
        selectionSort(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
