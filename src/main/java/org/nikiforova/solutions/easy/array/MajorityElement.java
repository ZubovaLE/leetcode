package org.nikiforova.solutions.easy.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    private final Map<Integer, Integer> numsAndCount = new HashMap<>();

    /**
     * @param nums - an array
     * @return the majority element that appears more than n / 2 times
     */
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        Integer current;
        for (int num : nums) {
            current = numsAndCount.putIfAbsent(num, 1);
            if (current != null) {
                numsAndCount.replace(num, current + 1);
            }
        }
        return Collections.max(numsAndCount.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }
}