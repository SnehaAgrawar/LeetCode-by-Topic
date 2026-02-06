/*
Problem: Remove Element
Platform: LeetCode
Question URL: https://leetcode.com/problems/remove-element/
Difficulty: Easy

Approach:
Traverse the array and keep a separate index pointer.
Whenever an element is not equal to the given value (val),
place it at the current index position and increment index.

This effectively removes the target value in-place.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int index = 0;

        // Traverse array
        for (int i = 0; i < nums.length; i++) {

            // If element is not equal to val, keep it
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("New length: " + k);
        System.out.print("Updated array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
