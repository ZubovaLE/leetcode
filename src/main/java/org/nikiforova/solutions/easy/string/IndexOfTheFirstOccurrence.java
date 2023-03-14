package org.nikiforova.solutions.easy.string;

public class IndexOfTheFirstOccurrence {
    /**
     * @param haystack - a string
     * @param needle   - a string
     * @return the index of first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     */
    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            for (int i = haystack.indexOf(needle.charAt(0)); i < haystack.length() - needle.length() + 1; i++) {
                if (haystack.regionMatches(i, needle, 0, needle.length())) {
                    return i;
                }
            }
        }
        return -1;
    }
}
