package org.nikiforova.solutions.easy.array;

public class FinalValueOfVariable {
    private final static String PRE_MINUS = "--X";
    private final static String POST_MINUS = "X--";
    private final static String PRE_PLUS = "++X";
    private final static String POST_PLUS = "X++";

    /**
     * There are only four operations and one variable X:
     * ++X and X++ increments the value of the variable X by 1.
     * --X and X-- decrements the value of the variable X by 1.
     * Initially, the value of X is 0.
     *
     * @param operations - an array of strings operations containing a list of operations
     * @return the final value of X after performing all the operations
     */
    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if (operation.equals(PRE_MINUS) || operation.equals(POST_MINUS)) {
                result--;
            } else if (operation.equals(PRE_PLUS) || operation.equals(POST_PLUS)) {
                result++;
            }
        }
        return result;
    }
}