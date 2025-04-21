package String;

import java.util.HashMap;

public class Permutation_String {
    public static HashMap<Character, Integer> getCharFrequency(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

        }

        return charCount;
    }

    // Method to count permutations of string2 in string1
    public static int countPermutations(String string1, String string2) {
        int permCount = 0;
        int windowSize = string2.length();
        HashMap<Character, Integer> string2Map = getCharFrequency(string2);

        for (int i = 0; i <= string1.length() - windowSize; i++) {
            String window = string1.substring(i, i + windowSize);
            if (getCharFrequency(window).equals(string2Map)) {
                permCount++;
            }
        }
        return permCount;
    }

    public static void main(String[] args) {
        String string1 = "hii my nmae name is ashu ym amne nmea eamn";
        String string2 = "naem";

        int result = countPermutations(string1, string2);
        System.out.println(result);
    }
}
