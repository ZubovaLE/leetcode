package org.nikiforova.solutions.easy.array;

import java.util.Arrays;

public class SmallerNumbers {
    /**
     * For each array element finds out how many numbers in the array are smaller than it.
     *
     * @param nums - an array
     * @return the answer in an array
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int[] copyOfNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyOfNums);
        for (int i = 0; i < nums.length; i++) {
            result[i] = findAmountOfSmallerNumbers(copyOfNums, nums[i]);
        }
        return result;
    }

    private int findAmountOfSmallerNumbers(int[] sortedCopyOfNums, int current) {
        for (int i = 0; i < sortedCopyOfNums.length; i++) {
            if (sortedCopyOfNums[i] >= current) {
                return i;
            }
        }
        return 0;
    }
}
