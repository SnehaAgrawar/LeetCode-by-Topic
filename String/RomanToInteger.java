/*
Problem: Roman to Integer
Platform: LeetCode
Question URL: https://leetcode.com/problems/roman-to-integer/
Difficulty: Easy

Approach:
Traverse the string from right to left.
If the current numeral is smaller than the previous processed value,
subtract it; otherwise add it.

This handles subtraction cases like IV, IX, XL, etc.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RomanToInteger {

    public static int romanToInt(String s) {
        int ans = 0, num = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

            // If smaller numeral appears before larger → subtract
            if (4 * num < ans)
                ans -= num;
            else
                ans += num;
        }

        return ans;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";

        int result = romanToInt(roman);

        System.out.println("Integer value: " + result);
    }
}
