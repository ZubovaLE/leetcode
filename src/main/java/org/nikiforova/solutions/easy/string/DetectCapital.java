package org.nikiforova.solutions.easy.string;

public class DetectCapital {
    /**
     * We define the usage of capitals in a word to be right when one of the following cases holds:
     * All letters in this word are capitals, like "USA".
     * All letters in this word are not capitals, like "leetcode".
     * Only the first letter in this word is capital, like "Google".
     *
     * @param word - a word
     * @return true if the usage of capitals in it is right
     */
    public static boolean detectCapitalUse(String word) {
        String substring = word.substring(1);
        if (Character.isUpperCase(word.charAt(0)) && substring.toLowerCase().equals(substring)) return true;
        else if (word.toUpperCase().equals(word)) return true;
        return word.toLowerCase().equals(word);
    }
}
