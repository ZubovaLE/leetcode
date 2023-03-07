package org.nikiforova.solutions.easy.array;

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappearedInArray {
    /**
     * @param nums - an array of n integers where nums[i] is in the range [1, n]
     * @return an array of all the integers in the range [1, n] that do not appear in nums
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] numsInOrder = new int[nums.length];
        List<Integer> disappear = new ArrayList<>();
        for (int num : nums) {
            numsInOrder[num - 1] = num;
        }
        fillResultList(numsInOrder, disappear);
        return disappear;
    }

    private static void fillResultList(int[] result, List<Integer> disappear) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                disappear.add(i + 1);
            }
        }
    }
}
