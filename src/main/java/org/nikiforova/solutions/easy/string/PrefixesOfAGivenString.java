package org.nikiforova.solutions.easy.string;

public class PrefixesOfAGivenString {
    /**
     * @param words- a string array
     * @param s      - a string
     * @return the number of strings in words that are a prefix of s
     */
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                count++;
            }
        }
        return count;
    }
}
