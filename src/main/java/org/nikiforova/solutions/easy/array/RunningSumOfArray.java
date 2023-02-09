package org.nikiforova.solutions.easy.array;

public class RunningSumOfArray {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        int current;
        for (int i = 0; i < nums.length; i++) {
            current = nums[i];
            sum += current;
            result[i] = sum;
        }
        return result;
    }
}
