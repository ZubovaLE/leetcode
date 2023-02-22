package org.nikiforova.solutions.easy.string;

public class PrefixReversing {
    /**
     * @param word - a string word
     * @param ch   - a character
     * @return the string that consists of the reversed segment of the word that starts at index 0 and ends at the
     * index of the first occurrence of ch (inclusive) and the rest of the string.
     * If the character ch does not exist in word, return nothing
     */
    public static String reversePrefix(String word, char ch) {
        StringBuilder builder = new StringBuilder();
        int position = word.indexOf(ch);
        return position == -1 ? word : builder.append(word.substring(0, position + 1)).reverse().append(word.substring(position + 1)).toString();
    }
}
