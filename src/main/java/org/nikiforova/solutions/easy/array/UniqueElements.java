package org.nikiforova.solutions.easy.array;

import java.util.*;

public class UniqueElements {
    /**
     * @param nums - an integer array
     * @return the sum of all the unique elements of nums
     */
    public static int sumOfUnique(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        List<Integer> blackList = new ArrayList<>();
        if (nums.length == 1) return nums[0];
        int sum = 0;
        boolean isUnique = true;
        for (int num : nums) {
            if (!blackList.contains(num)) isUnique = uniqueNums.add(num);
            if (!isUnique) {
                uniqueNums.remove(num);
                blackList.add(num);
            }
        }
        for (int unique : uniqueNums) {
            sum += unique;
        }
        return sum;
    }
}
