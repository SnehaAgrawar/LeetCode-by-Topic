/*
Problem: Palindrome Number
Platform: LeetCode
Question URL: https://leetcode.com/problems/palindrome-number/
Difficulty: Easy

Approach:
Negative numbers cannot be palindrome.
Reverse only half of the number to avoid overflow.
Compare first half with reversed second half.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        // Negative numbers or numbers ending with 0 (except 0)
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int reversedHalf = 0;

        // Reverse only half of number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // Handles even and odd digit cases
        return (x == reversedHalf || x == reversedHalf / 10);
    }

    public static void main(String[] args) {
        int num = 121;

        boolean result = isPalindrome(num);

        System.out.println("Is palindrome: " + result);
    }
}
