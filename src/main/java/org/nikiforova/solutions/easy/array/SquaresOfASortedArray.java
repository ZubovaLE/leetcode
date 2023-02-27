package org.nikiforova.solutions.easy.array;

import java.util.Arrays;

public class SquaresOfASortedArray {
    /**
     * @param nums - an integer array sorted in non-decreasing order
     * @return an array of the squares of each number sorted in non-decreasing order
     */
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int current;
        for (int i = 0; i < nums.length; i++) {
            current = nums[i];
            result[i] = current * current;
        }
        Arrays.sort(result);
        return result;
    }
}
