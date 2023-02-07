package org.nikiforova.solutions.easy.string;

public class MaximumNumberOfWords {
    private final static String DELIMITER = " ";

    /**
     * @param sentences - an array of strings sentences
     * @return the maximum number of words that appear in a single sentence
     * Constraints:
     * 1 <= sentences.length <= 100
     * 1 <= sentences[i].length <= 100
     * sentences[i] consists only of lowercase English letters and ' ' only.
     * sentences[i] does not have leading or trailing spaces.
     * All the words in sentences[i] are separated by a single space.
     */
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        int numberOfWords;
        for (String sentence : sentences) {
            numberOfWords = sentence.split(DELIMITER).length;
            if (numberOfWords > max) {
                max = numberOfWords;
            }
        }
        return max;
    }
}
