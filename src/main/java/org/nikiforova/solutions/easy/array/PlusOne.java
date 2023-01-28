package org.nikiforova.solutions.easy.array;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int arrayLength = digits.length;
        for (int i = arrayLength - 1; i > 0; i--) {
            if (digits[i] > 9) {
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            }
        }
        if (digits[1] > 9 && digits[0] == 9) {
            int[] result = new int[arrayLength + 1];
            System.arraycopy(digits, 1, result, 2, result.length - 2);
            result[0] = 1;
            result[1] = 0;
            return result;
        }
        return digits;
    }
}
