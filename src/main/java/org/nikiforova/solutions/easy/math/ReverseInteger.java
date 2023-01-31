package org.nikiforova.solutions.easy.math;

public class ReverseInteger {
    public static int reverse(int x) {
        if (x >= 0 && x < 10) return x;
        int reversedInt = 0;
        while (x != 0) {
            int d = x % 10;
            if (reversedInt > Integer.MAX_VALUE / 10 || reversedInt < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reversedInt = (reversedInt * 10) + d;
            x /= 10;
        }
        return reversedInt;
    }
}
