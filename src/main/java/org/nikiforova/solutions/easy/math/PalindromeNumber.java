package org.nikiforova.solutions.easy.math;

public class PalindromeNumber {
    /**
     * @param x - an integer
     * @return true if x is a palindrome, and false otherwise
     */
    public static boolean isPalindrome(int x) {
        if (x >= 0) {
            String stringOfX = String.valueOf(x);
            StringBuilder builder = new StringBuilder(stringOfX);
            String reversedNumber = builder.reverse().toString();
            return reversedNumber.equals(stringOfX);
        }
        return false;
    }
}
