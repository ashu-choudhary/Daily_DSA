
package Searching_Algo.ALGOs;

import java.util.Scanner;

class LinearSearch {

    static int search(int[] arr, int x){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int n = sc.nextInt();

        if(search(arr,n)==0){
            System.out.println("Element "+n+" is not found");
        }
        else {
            System.out.println("Element found in "+search(arr, n)+" position");
        }
    }
}

