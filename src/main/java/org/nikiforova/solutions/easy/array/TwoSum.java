package org.nikiforova.solutions.easy.array;

public class TwoSum {
    /**
     * Finds two numbers from an array of integers such that they add up to a given integer target and returns its indices.
     * Finds only the first solution, doesn't use the same element twice.
     *
     * @param nums   - an array of integers
     * @param target - an integer target
     * @return indices of the two numbers such that they add up to target
     * @throws IllegalArgumentException if {@code nums} size is less than 2
     */
    public static int[] twoSum(int[] nums, int target) {
        int arrayLength = nums.length;
        if (arrayLength < 2) {
            throw new IllegalArgumentException("Invalid array length. It must be greater than 1");
        }
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
