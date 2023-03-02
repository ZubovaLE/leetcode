package org.nikiforova.solutions.easy.array;

import java.util.ArrayList;
import java.util.List;

public class TargetArrayInTheGivenOrder {
    /**
     * Creates target array under the following rules:
     * Initially target array is empty.
     * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
     * Repeat the previous step until there are no elements to read in nums and index.
     *
     * @param nums  - an array of integers
     * @param index - an array of integers
     * @return the target array
     */
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(index[i], nums[i]);
        }
        return result.stream().mapToInt(x -> x).toArray();
    }
}
