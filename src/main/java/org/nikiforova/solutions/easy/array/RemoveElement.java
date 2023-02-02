package org.nikiforova.solutions.easy.array;

import java.util.Arrays;

public class RemoveElement {
    /**
     * Removes all occurrences of an integer val in an integer array nums in-place.
     * The relative order of the elements may be changed.
     *
     * @param nums - an integer array
     * @param val  -an integer
     * @return k after placing the final result in the first k slots of nums.
     */
    public static int removeElement(int[] nums, int val) {
        int[] afterDeleting = Arrays.stream(nums).filter(n -> n != val).toArray();
        System.arraycopy(afterDeleting, 0, nums, 0, afterDeleting.length);
        return afterDeleting.length;
    }
}
