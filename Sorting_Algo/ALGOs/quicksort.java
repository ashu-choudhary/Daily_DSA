package Sorting_Algo.ALGOs;

public class quicksort {

    public static void print(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }   
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 77, 1, 8, 44, 2, 9, 0};
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
}