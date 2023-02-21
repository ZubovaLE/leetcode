package org.nikiforova.solutions.easy.string;

public class EquivalentStrings {
    /**
     * @param word1  - a string array
     * @param word2- a string array
     * @return true if the two arrays represent the same string, and false otherwise.
     */
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstWord = getWord(word1);
        String secondWord = getWord(word2);
        return firstWord.equals(secondWord);
    }

    private static String getWord(String[] subWords) {
        StringBuilder wordBuilder = new StringBuilder();
        for (String subWord : subWords) {
            wordBuilder.append(subWord);
        }
        return wordBuilder.toString();
    }
}
