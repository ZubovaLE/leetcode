package org.nikiforova.solutions.easy.math;

public class OddNumbersInInterval {
    /**
     * @param low  - a non-negative integer
     * @param high - a non-negative integer
     * @return the count of odd numbers between low and high (inclusive)
     */
    public int countOdds(int low, int high) {
        if (low % 2 != 0 || high % 2 != 0) return (high - low) / 2 + 1;
        else return (high - low) / 2;
    }
}