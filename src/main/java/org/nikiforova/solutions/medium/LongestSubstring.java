package org.nikiforova.solutions.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestSubstring {
    /**
     * Finds the length of the longest substring without repeating characters.
     *
     * @param s - a string
     * @return the length of the longest substring without repeating characters
     */
    public static int lengthOfLongestSubstring(String s) {
        int stringSize = s.length();
        if (stringSize == 0 || stringSize == 1) return stringSize;
        int startIndexOfSubstring = 0;
        char currentChar;
        String subString;
        List<Integer> lengthsOfSubstrings = new ArrayList<>();
        for (int i = 1; i < stringSize; i++) {
            subString = s.substring(startIndexOfSubstring, i);
            currentChar = s.charAt(i);
            if (subString.indexOf(currentChar) != -1) {
                lengthsOfSubstrings.add(subString.length());
                startIndexOfSubstring = startIndexOfSubstring + subString.indexOf(currentChar) + 1;
                continue;
            }
            if (i == stringSize - 1 && subString.indexOf(currentChar) == -1) {
                lengthsOfSubstrings.add(subString.length() + 1);
            }
        }
        return Collections.max(lengthsOfSubstrings);
    }
}