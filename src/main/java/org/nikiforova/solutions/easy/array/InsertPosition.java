package org.nikiforova.solutions.easy.array;

public class InsertPosition {
    /**
     * @param nums   - a sorted array of distinct integers
     * @param target - an integer target value
     * @return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     */
    public static int searchInsert(int[] nums, int target) {
        int index;
        for (index = 0; index < nums.length; index++) {
            if (target <= nums[index]) return index;
        }
        return index;
    }
}
