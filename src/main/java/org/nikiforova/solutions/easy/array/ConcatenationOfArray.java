package org.nikiforova.solutions.easy.array;

import java.util.Arrays;

public class ConcatenationOfArray {
    /**
     * Creates a result array which is the concatenation of two nums arrays.
     *
     * @param nums - an integer array of length n
     * @return the result array  of length 2n where result[i] == nums[i] and result[i + n] == nums[i] for 0 <= i < n
     */
    public static int[] getConcatenation(int[] nums) {
        int[] result = Arrays.copyOf(nums, nums.length * 2);
        System.arraycopy(nums, 0, result, nums.length, nums.length);
        return result;
    }
}
