package org.nikiforova.solutions.easy.string;

public class PercentageOfLetterInString {
    /**
     * @param s      - a string
     * @param letter - a character
     * @return the percentage of characters in s that equal letter rounded down to the nearest whole percent
     */
    public static int percentageLetter(String s, char letter) {
        if (s.indexOf(letter) < 0) {
            return 0;
        } else {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == letter) {
                    count++;
                }
            }
            return count * 100 / s.length();
        }
    }
}
