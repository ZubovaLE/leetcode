package org.nikiforova.solutions.easy.string;

public class WordsWithAGivenPrefix {
    /**
     * A prefix of a string s is any leading contiguous substring of s.
     * @param words - an array of strings words
     * @param pref - a string
     * @return the number of strings in words that contain pref as a prefix
     */
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) count++;
        }
        return count;
    }
}
