/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.
*/

import java.util.HashMap;

class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // Using HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement exists in map, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise store current number with index
            map.put(nums[i], i);
        }

        // As per problem, solution always exists
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 6 };
        int target = 17;

        int[] result = twoSum(nums, target);

        // Print result safely
        if (result != null) {
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
