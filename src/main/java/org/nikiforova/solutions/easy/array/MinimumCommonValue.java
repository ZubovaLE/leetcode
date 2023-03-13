package org.nikiforova.solutions.easy.array;

public class MinimumCommonValue {
    /**
     * Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return .
     * <p>
     * Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
     *
     * @param nums1 - an integer array, sorted in non-decreasing order
     * @param nums2 - an integer array, sorted in non-decreasing order
     * @return the minimum integer common to both arrays. If there is no common integer, return -1.
     */
    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return -1;
    }
}
