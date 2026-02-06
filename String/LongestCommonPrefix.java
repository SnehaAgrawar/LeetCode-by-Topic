/*
Problem: Longest Common Prefix
Platform: LeetCode
Question URL: https://leetcode.com/problems/longest-common-prefix/
Difficulty: Easy

Approach:
Take the first string as reference.
Compare characters one-by-one with all other strings.
Stop when mismatch occurs.

Time Complexity: O(n * m)
n = number of strings, m = length of shortest string
Space Complexity: O(1)
*/

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        String result = longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);
    }
}
