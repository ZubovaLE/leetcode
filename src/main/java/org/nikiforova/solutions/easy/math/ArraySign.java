package org.nikiforova.solutions.easy.math;

public class ArraySign {
    /**
     * @param nums - an integer array
     * @return the sign of product of all values in the array
     * 1 if x is positive.
     * -1 if x is negative.
     * 0 if x is equal to 0.
     */
    public static int arraySign(int[] nums) {
        int minusCount = 0;
        for (int n : nums) {
            if (n == 0) {
                return 0;
            }
            if (n < 0) {
                minusCount++;
            }
        }
        return minusCount % 2 == 0 ? 1 : -1;
    }

    public static void main(String[] args) {
        System.out.println(arraySign(new int[]{1, -1, 1, -1}));
        System.out.println(arraySign(new int[]{-1, -1, 1, -1}));
        System.out.println(arraySign(new int[]{-1, -1, 0, -1}));
    }
}
