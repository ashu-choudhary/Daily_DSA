package Bit_Manupulation;

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
