package org.nikiforova.solutions.easy.math;

import java.util.ArrayList;
import java.util.List;

public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        if (n < 10) return 0;
        List<Integer> nums = getNums(n);
        int sum = 0;
        int prod = 1;
        for (Integer num : nums) {
            prod *= num;
            sum += num;
        }
        return prod - sum;
    }

    private static List<Integer> getNums(int n) {
        List<Integer> nums = new ArrayList<>();
        while (n > 0) {
            nums.add(n % 10);
            n /= 10;
        }
        return nums;
    }
}
