package org.nikiforova.solutions.easy.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    /**
     * @param nums - an integer array
     * @param k    - an integer
     * @return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k,
     * false otherwise
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numsAndPositions = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsAndPositions.containsKey(nums[i])) {
                if (Math.abs(i - numsAndPositions.get(nums[i])) <= k) {
                    return true;
                }
            }
            numsAndPositions.put(nums[i], i);
        }
        return false;
    }
}
