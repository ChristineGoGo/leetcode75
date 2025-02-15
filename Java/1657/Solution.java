
import java.util.*;

public class Solution {
    /**
     * Two strings are considered close if you can attain one from the other using the following operations:
            Operation 1: Swap any two existing characters.
            For example, abcde -> aecdb
            Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
            For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
            You can use the operations on either string as many times as necessary.

        Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
     */


     public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }


        Map<String, Integer> word1Count = new HashMap<>();
        Map<String, Integer> word2Count = new HashMap<>();
        String current = " ";
        Integer currentCount = 0;

        for (int i = 0; i < word1.length(); i++) {
            current += word1.charAt(0);
            if (word1Count.get(current) == null) {
                word1Count.put(current, 1);
            }
            currentCount = word1Count.get(current);
            currentCount++;
            word1Count.put(current, currentCount);
        }

        for (int i = 0; i < word2.length(); i++) {
            current += word2.charAt(0);
            if (word2Count.get(current) == null) {
                word2Count.put(current, 1);
            }
            currentCount = word2Count.get(current);
            currentCount++;
            word2Count.put(current, currentCount);
        }

        if (!word1Count.keySet().equals(word2Count.keySet())) {
            return false;
        }

        List<Integer> word1FrequencyList = new ArrayList<>(word1Count.values());
        List<Integer> word2FrequencyList = new ArrayList<>(word2Count.values());

        Collections.sort(word1FrequencyList);
        Collections.sort(word2FrequencyList);

        return word1FrequencyList.equals(word2FrequencyList);
        
    }

    public static void main(String[] args) {
        boolean result = Solution.closeStrings("abc", "bca");
        System.out.print(result);
    }

}
