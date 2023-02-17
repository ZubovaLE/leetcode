package org.nikiforova.solutions.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
    /**
     * @param nums   - a 0-indexed integer array
     * @param target - a target element
     * @return list of the target indices of nums after sorting nums in non-decreasing order.
     * A target index is an index i such that nums[i] == target
     */
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indices = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
            if (nums[i] > target) {
                break;
            }
        }
        return indices;
    }
}
