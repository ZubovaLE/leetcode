package org.nikiforova.solutions.easy.string;

public class LengthofLastWord {
    private final static String DELIMITER = " ";

    /**
     * Given a string s consisting of words and spaces.
     * A word is a maximal substring consisting of non-space characters only.
     *
     * @param s
     * @return the length of the last word in the string
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
