package org.nikiforova.solutions.easy.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {
    /**
     * @param num - array-form of an integer
     * @param k   - an integer
     * @return the array-form of the integer num + k
     */
    public List<Integer> addToArrayForm(int[] num, int k) {
        int lengthOfNum = num.length;
        int current = k;
        List<Integer> result = new ArrayList<>();
        int i = lengthOfNum;
        while (--i >= 0 || current > 0) {
            if (i >= 0)
                current += num[i];
            result.add(current % 10);
            current /= 10;
        }
        Collections.reverse(result);
        return result;
    }
}