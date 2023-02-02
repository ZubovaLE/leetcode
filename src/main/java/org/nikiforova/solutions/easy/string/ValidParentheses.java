package org.nikiforova.solutions.easy.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ValidParentheses {
    private static final Map<Character, Character> pairs = Map.of('(', ')', '[', ']', '{', '}');

    /**
     * Determines if the input string is valid.
     * An input string is valid if:
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     *
     * @param s - a string containing just the characters '(', ')', '{', '}', '[' and ']'
     * @return true if the string is valid, and false otherwise
     */
    public static boolean isValid(String s) {
        int stringLength = s.length();
        if (stringLength % 2 != 0) return false;
        List<Character> opposites = new ArrayList<>();
        char current = s.charAt(0);
        if (pairs.get(current) == null) return false;
        opposites.add(pairs.get(current));
        for (int i = 1; i < stringLength; i++) {
            current = s.charAt(i);
            if (opposites.size() != 0 && current != opposites.get(opposites.size() - 1) && pairs.get(current) == null) {
                return false;
            } else if ((opposites.size() == 0 || current != opposites.get(opposites.size() - 1)) && pairs.get(current) != null) {
                opposites.add(pairs.get(current));
            } else if (opposites.size() != 0 && current == opposites.get(opposites.size() - 1)) {
                opposites.remove(opposites.size() - 1);
            } else return false;
        }
        return opposites.size() == 0;
    }
}
