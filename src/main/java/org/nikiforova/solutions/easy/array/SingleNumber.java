package org.nikiforova.solutions.easy.array;

import java.util.Arrays;

public class SingleNumber {

    /**
     * @param nums - a non-empty array of integers, every element appears twice except for one
     * @return single element
     */
    public static int singleNumber(int[] nums) {
        int numsSize = nums.length;
        if (numsSize == 1) return nums[0];
        Arrays.sort(nums);
        for (int i = 0; i < numsSize - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[numsSize - 1];
    }
}
