package Sorting_Algo.QUESTIONS;

//https://leetcode.com/problems/rabbits-in-forest/description/?envType=daily-question&envId=2025-04-20

/*


There is a forest with an unknown number of rabbits.
We asked n rabbits "How many rabbits have the same color as you?" and collected the answers
in an integer array answers where answers[i] is the answer of the ith rabbit.
Given the array answers, return the minimum number of rabbits that could be in the forest.



Example 1:

Input: answers = [1,1,2]
Output: 5
Explanation:
The two rabbits that answered "1" could both be the same color, say red.
The rabbit that answered "2" can't be red or the answers would be inconsistent.
Say the rabbit that answered "2" was blue.
Then there should be 2 other blue rabbits in the forest that didn't answer into the array.
The smallest possible number of rabbits in the forest is therefore 5: 3 that
answered plus 2 that didn't.
Example 2:

Input: answers = [10,10,10]
Output: 11


Constraints:

1 <= answers.length <= 1000
0 <= answers[i] < 1000

*/

import java.util.*;

public class RabbitsinForest {
    public static void main(){
        int[] arr = {1,2,2,1,5};

        System.out.println(findrabbit(arr));
    }

    static int findrabbit(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for(int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);

        }

        int ans = 0;

        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            int k = mp.getKey();
            int v = mp.getValue();
            int gs = k + 1;
            int gp = (k+v) / gs;
            ans += gp * gs;
        }

        return ans;
    }



}
