package org.nikiforova.solutions.easy.string;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        String substring = word.substring(1);
        if (Character.isUpperCase(word.charAt(0)) && substring.toLowerCase().equals(substring)) return true;
        else if (word.toUpperCase().equals(word)) return true;
        return word.toLowerCase().equals(word);
    }
}
