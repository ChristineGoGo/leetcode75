import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1657 {
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

        // Two conditions must be met:  All the characters present in word1 must be present in word2
        // The frequency of the characted must be the same

        if (word1.length() != word2.length()) {
            return false;
        }


        Map<Character, Integer> word1Count = new HashMap<>();
        Map<Character, Integer> word2Count = new HashMap<>();
    

        for (char c: word1.toCharArray()) {
            if (word1Count.get(c) == null) {
                word1Count.put(c, 1);
            } else {
                word1Count.put(c, word1Count.get(c) + 1);
            }
        }

        for (char c: word2.toCharArray()) {
            if (word2Count.get(c) == null) {
                word2Count.put(c, 1);
            } else {
                word2Count.put(c, word2Count.get(c) + 1);
            }
        }

        System.out.println("word1Count keyset: " + word1Count.keySet());
        System.out.println("word2Count keyset: " + word2Count.keySet());

        // Satisy condition 1:
        // System.out.println(word1Count.keySet().equals(word2Count.keySet()));
        if (!word1Count.keySet().equals(word2Count.keySet())) {
            // System.out.println("Keyset are not equal");
            return false;
        }

        // Satisy condition 2:
        List<Integer> word1FrequencyList = new ArrayList<>(word1Count.values());
        List<Integer> word2FrequencyList = new ArrayList<>(word2Count.values());

        Collections.sort(word1FrequencyList);
        Collections.sort(word2FrequencyList);


  

        return word1FrequencyList.equals(word2FrequencyList);
    }

    public static void main(String[] args) {
        boolean result = closeStrings("abc", "bca");
        System.out.print(result);

    }


}
