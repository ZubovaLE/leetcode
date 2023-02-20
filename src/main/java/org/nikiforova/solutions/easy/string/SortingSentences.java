package org.nikiforova.solutions.easy.string;

import java.util.HashMap;
import java.util.Map;

public class SortingSentences {
    public String sortSentence(String s) {
        Map<Integer, String> numsAndWords = new HashMap<>();
        String[] words = s.split(" ");
        for (String word : words) {
            numsAndWords.put(Character.getNumericValue(word.charAt(word.length() - 1)), word);
        }
        StringBuilder builder = new StringBuilder();
        String current;
        for (int i = 1; i <= words.length; i++) {
            current = numsAndWords.get(i);
            builder.append(current.substring(0, current.length() - 1)).append(" ");
        }
        return builder.toString().trim();
    }
}
