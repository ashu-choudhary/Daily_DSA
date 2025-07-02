package String;

import java.util.ArrayList;
import java.util.List;

public class EncodeandDecodeStrings {
    public static void main(String[] args) {
        // Input list of strings to encode
        List<String> list = List.of("neet", "code", "love", "you");

        // Encode the list of strings into a single string
        String res = encode(list);
        System.out.println(res);  // Print the encoded result

        // Decode the encoded string back to the original list
        List<String> res2 = decode(res);
        for (String s : res2) {
            System.out.print(s + " ");  // Print each decoded string
        }
    }

    // Function to encode a list of strings into a single string
    public static String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        // Loop through each string in the list
        for (String s : strs) {
            // Append length of string, followed by '#', followed by the string itself
            // This helps uniquely identify the string when decoding
            res.append(s.length()).append('#').append(s);
        }

        // Return the final encoded string
        return res.toString();
    }

    // Function to decode the single string back into a list of strings
    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        // Loop until we reach the end of the encoded string
        while (i < str.length()) {
            int j = i;

            // Find the index of '#' which separates length and actual string
            while (str.charAt(j) != '#') {
                j++;
            }

            // Extract the number representing the length of the next string
            int length = Integer.parseInt(str.substring(i, j));

            // Move to the start of the actual string after '#'
            i = j + 1;

            // Extract the string of the given length
            j = i + length;
            res.add(str.substring(i, j));

            // Move the pointer to the start of the next length prefix
            i = j;
        }

        // Return the list of decoded strings
        return res;
    }
}
