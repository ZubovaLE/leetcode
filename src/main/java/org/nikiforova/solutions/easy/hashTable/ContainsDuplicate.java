package org.nikiforova.solutions.easy.hashTable;

import java.util.*;

public class ContainsDuplicate {
    /**
     * @param nums - an integer array
     * @return - true if any value appears at least twice in the array, and false if every element is distinct
     */
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) return false;
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            if (!uniqueNums.add(num)) {
                return true;
            }
        }
        return false;
    }
}