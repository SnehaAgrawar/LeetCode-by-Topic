/*
Problem: Remove Duplicates from Sorted Array
Platform: LeetCode
Question URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Difficulty: Easy

Approach:
Since the array is sorted, duplicate elements appear consecutively.
We use two pointers:
- 'i' tracks position of last unique element.
- 'j' scans the array.

Whenever nums[j] != nums[i],
place nums[j] at nums[i+1] and increment i.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int size = nums.length;

        for (int j = 1; j < size; j++) {

            // Skip duplicates
            if (nums[i] == nums[j]) {
                continue;
            }

            // Place next unique element
            nums[i + 1] = nums[j];
            i++;
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        System.out.print("Updated array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
