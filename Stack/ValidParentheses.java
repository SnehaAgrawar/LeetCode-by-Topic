/*
Problem: Valid Parentheses
Platform: LeetCode
Question URL: https://leetcode.com/problems/valid-parentheses/
Difficulty: Easy

Approach:
Use a stack to track expected closing brackets.
Push closing bracket when encountering opening bracket.
If mismatch or stack empty → invalid.
Finally stack must be empty.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // Push expected closing bracket
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');

            // Check matching bracket
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        // Stack must be empty for valid string
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}";

        boolean result = isValid(input);

        System.out.println("Is valid parentheses: " + result);
    }
}
