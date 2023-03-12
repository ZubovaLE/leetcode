package org.nikiforova.solutions.easy.array;

public class AverageValueOfEvenNumbers {
    /**
     * @param nums - an integer array nums of positive integers
     * @return the average value of all even integers that are divisible by 3
     */
    public static int averageValue(int[] nums) {
        int result = 0;
        int count = 0;
        for (int num : nums) {
            if (num % 6 == 0) {
                result += num;
                count++;
            }
        }
        return count == 0 ? 0 : result / count;
    }
}
