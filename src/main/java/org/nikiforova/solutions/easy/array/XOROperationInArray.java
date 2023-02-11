package org.nikiforova.solutions.easy.array;

public class XOROperationInArray {
    /**
     * @param n     - an integer
     * @param start - an integer
     * @return the bitwise XOR of all elements of an array
     */
    public int xorOperation(int n, int start) {
        int result = 0;
        int element;
        for (int i = 0; i < n; i++) {
            element = start + 2 * i;
            result ^= element;
        }
        return result;
    }
}
