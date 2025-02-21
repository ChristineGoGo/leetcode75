package leetcode_394;
import java.util.*;

public class Solution {
    public static String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> currentStringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        
        int occurences = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                occurences = occurences * 10 + s.charAt(i) - '0';
            } else if (s.charAt(i) == ('[')) {
                count.push(occurences);
                currentStringStack.push(currentString);
                currentString = new StringBuilder();
                occurences = 0;

            } else if (s.charAt(i) == ']') {
                StringBuilder decodedString = currentStringStack.pop();
                for (int currentCount = count.pop(); currentCount > 0; currentCount--) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(s.charAt(i));
            }
        }
        return currentString.toString();
    }

    public static void main(String[] args) {
        String test1 = "3[a]2[bc]";
        System.out.println(decodeString(test1));

    }

}
