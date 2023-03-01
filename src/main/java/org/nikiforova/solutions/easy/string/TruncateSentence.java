package org.nikiforova.solutions.easy.string;

import java.util.Arrays;

public class TruncateSentence {
    /**
     * Truncates a sentence such that it contains only the first k words.
     *
     * @param s - a sentence
     * @param k - an integer
     * @return s after truncating it
     */
    public static String truncateSentence(String s, int k) {
        return String.join(" ", Arrays.copyOf(s.split(" "), k));
    }
}
