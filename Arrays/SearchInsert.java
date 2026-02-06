/*
Problem: Search Insert Position
Platform: LeetCode
Question URL: https://leetcode.com/problems/search-insert-position/
Difficulty: Easy

Approach:
Use binary search to find target position.
If target exists, return index.
Otherwise return index where it should be inserted.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        // left will be insertion position
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int position = searchInsert(nums, target);

        System.out.println("Insert position: " + position);
    }
}
