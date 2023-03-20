package org.nikiforova.solutions.easy.array;

public class CountingNegativeNumbers {
    /**
     * @param grid - a mxn matrix grid which is sorted in non-increasing order both row-wise and column-wise
     * @return the number of negative numbers in grid
     */
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int x[] : grid) {
            for (int y : x) {
                if (y < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
