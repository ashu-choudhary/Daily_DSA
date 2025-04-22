package String;

//https://www.geeksforgeeks.org/problems/minimum-indexed-character0221/1

/*
Given a string S and another string patt. Find the character in patt that is present at the minimum index in S.


Example 1:

Input: S = "zsyle", patt = "bjz"
Output: "z"
Example 2:

Input: S = "anskg", patt = "me"
Output: "$"


Your Task:
You don't need to read or print anything. Your task is to complete the function printMinIndexChar() which takes S and patt as input parameter and returns the character in patt that is present at the minimum index in S. If not possible returns "$".


Expected Time Complexity: O(max(|str|, |patt|))
Expected Auxilary Space: O(K) where K <= 26


Constraints:
1 ≤ |S|, |patt| ≤ 104


*/



import java.util.*;

public class Minimumindexedcharacter {



    public static void main() {
        String s1 = "asdf";
        String s2 = "ahrf";

        System.out.println(findstring(s1,s2));
    }

    static String findstring(String S, String patt) {

        String str = "";
        int i;
        HashSet<Character> set = new HashSet<> ();

        for(i=0;i<patt.length();i++){
            set.add(patt.charAt(i));
        }

        for(i=0;i<S.length();i++){
            if(set.contains(S.charAt(i))){
                break;
            }
        }

        if(i<S.length()){
            str = str + S.charAt(i);
        }
        else{
            str = "$";
        }

        return str;

    }
}
