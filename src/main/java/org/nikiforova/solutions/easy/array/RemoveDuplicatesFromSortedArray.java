package org.nikiforova.solutions.easy.array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    /**
     * Removes the duplicates in-place such that each unique element appears only once.
     *
     * @param nums - an integer array
     * @return k after placing the final result in the first k slots of nums.
     */
    public static int removeDuplicates(int[] nums) {
        int result = nums.length;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == nums[i - 1]) {
                nums[i] = 101;
                result--;
            }
        }
        Arrays.sort(nums);
        return result;
    }
}