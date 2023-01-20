package org.nikiforova.solutions.easy.string;

public class ReverseString {
    /**
     * Reverses a string that is given as an array of characters s
     * @param s - an array of characters
     */
    public static void reverseString(char[] s) {
        int arrayLength = s.length;
        char temp;
        for (int i = 0; i < arrayLength / 2; i++) {
        temp = s[i];
        s[i] = s[arrayLength - i - 1];
        s[arrayLength - i - 1] = temp;
        }
    }
}
