package org.nikiforova.solutions.easy.array;

public class BuildArrayFromPermutation {

    /**
     * @param nums - an array of distinct integers from 0 to nums.length - 1 (inclusive).
     * @return an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length.
     */
    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
