package org.nikiforova.solutions.easy.string;

public class WordsReversing {
    /**
     * Reverses the order of characters in each word within a sentence while still preserving whitespace and initial word order.
     *
     * @param s - a string
     * @return the string with reversed words
     */
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        for (String word : s.split(" ")) {
            StringBuilder current = new StringBuilder(word);
            current.reverse();
            result.append(current).append(" ");
        }
        return result.toString().trim();
    }
}
