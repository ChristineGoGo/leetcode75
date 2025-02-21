package leetcode_394;

public class Solution {
    public static String decodeString(String s) {
        Stack<String> stck = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if (s.charAt(i) != ']') {
                stck.push(s.charAt(i));
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String str = "3[a2[c]]";
        System.out.println(decodeString(str));
    }

}
