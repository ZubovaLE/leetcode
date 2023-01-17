package org.nikiforova.solutions.easy.string;

public class LengthOfLastWord {
    private final static String DELIMITER = " ";

    /**
     * @param s - a string consisting of words and spaces
     * @return the length of the last word in the string
     * Note: a word is a maximal substring consisting of non-space characters only
     */
    public static int lengthOfLastWord(String s) {
        if (s == null) return 0;
        String[] words = s.split(DELIMITER);
        int arrayLength = words.length;
        if (arrayLength == 1) return s.trim().length();
        else {
            int pointer = arrayLength - 1;
            while (words[pointer].equals("")) {
                pointer--;
            }
            return words[pointer].length();
        }
    }
}
