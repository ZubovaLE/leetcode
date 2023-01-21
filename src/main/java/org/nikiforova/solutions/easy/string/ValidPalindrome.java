package org.nikiforova.solutions.easy.string;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.length() == 1) return true;
        String sWithoutUnnecessary = s.replaceAll("[\\p{Punct}\\s]", "").toLowerCase();
        StringBuilder builder = new StringBuilder(sWithoutUnnecessary);
        return sWithoutUnnecessary.equals(builder.reverse().toString());
    }
}
