package Sorting_Algo;

public class bubblesort{

    public static void print(int[] arr, int swap, int comp){
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println("\nTotal swaps: " + swap);
        System.out.println("Total comparisons: " + comp);
    }

    public static void bublesort(int[] arr){
        int n = arr.length;
        int swap = 0, comp = 0;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
                comp++;
            }
        }
        print(arr, swap, comp);
       
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,77,1,8,44,2,9};

        bublesort(arr);
    }
}