package org.nikiforova.solutions.easy.array;

import java.util.Arrays;
public class MergeSortedArray {
    /**
     * Merges two integer arrays nums1 and nums2 into a single array sorted in non-decreasing order.
     * @param nums1 - an integer array
     * @param m - the number of elements in nums1
     * @param nums2 - an integer array
     * @param n - the number of elements in nums2
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < m + n; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}
