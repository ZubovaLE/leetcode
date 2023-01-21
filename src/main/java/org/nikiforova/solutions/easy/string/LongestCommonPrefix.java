package org.nikiforova.solutions.easy.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    /**
     * Finds the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     *
     * @param strs - an array of strings
     * @return - the longest common prefix string amongst the array if found,
     * an empty string "" otherwise.
     */
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int minLength = Arrays.stream(strs)
                .mapToInt(String::length)
                .min().getAsInt();
        if (minLength > 0) {
            StringBuilder checkablePrefix = new StringBuilder();
            String firstStr = strs[0];
            for (int pointer = 0; pointer < minLength; pointer++) {
                checkablePrefix.append(firstStr.charAt(pointer));
                for (String word : strs) {
                    if (!word.startsWith(checkablePrefix.toString())) {
                        return result;
                    }
                }
                result = checkablePrefix.toString();
            }
        }
        return result;
    }
}