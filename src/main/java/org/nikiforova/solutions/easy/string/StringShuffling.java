package org.nikiforova.solutions.easy.string;

public class StringShuffling {
    /**
     * @param s       - a string
     * @param indices - an integer array
     * @return the shuffled string
     */
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        return String.valueOf(result);
    }
}