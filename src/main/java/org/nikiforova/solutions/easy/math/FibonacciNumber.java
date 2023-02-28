package org.nikiforova.solutions.easy.math;

public class FibonacciNumber {
    /**
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each
     * number is the sum of the two preceding ones, starting from 0 and 1. That is, F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2), for n > 1.
     *
     * @param n - an integer
     * @return F(n)
     */
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            int count = 1;
            int previous = 0;
            int current = 1;
            int tmp;
            while (count != n) {
                tmp = current;
                current += previous;
                previous = tmp;
                count++;
            }
            return current;
        }
    }
}
