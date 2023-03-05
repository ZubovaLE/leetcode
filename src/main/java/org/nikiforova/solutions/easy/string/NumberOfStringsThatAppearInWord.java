package org.nikiforova.solutions.easy.string;

public class NumberOfStringsThatAppearInWord {
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns) {
            if (word.contains(s)) {
                count++;
            }
        }
        return count;
    }
}
