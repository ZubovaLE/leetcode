package org.nikiforova.solutions.easy.math;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n == 0 || n < 0) return false;
        return (n & -n) == n;
    }
}
