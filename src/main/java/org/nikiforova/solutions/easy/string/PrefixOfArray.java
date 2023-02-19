package org.nikiforova.solutions.easy.string;

public class PrefixOfArray {
    /**
     * Determines whether a string is a prefix string of words in an array.
     *
     * @param s     - a string
     * @param words - an array of strings words
     * @return true if s is a prefix string of words, or false otherwise
     */
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder builder = new StringBuilder();
        int builderLength;
        for (String word : words) {
            builder.append(word);
            builderLength = builder.length();
            if (s.length() < builderLength || s.charAt(builderLength - 1) != builder.charAt(builderLength - 1)) {
                return false;
            }
            if (builder.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
