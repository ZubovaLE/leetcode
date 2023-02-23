package org.nikiforova.solutions.easy.string;

import java.util.*;

public class TwiceAppearing {
    /**
     * s will contain at least one letter that appears twice.
     *
     * @param s - a string
     * @return the first letter to appear twice
     */
    public char repeatedCharacter(String s) {
        List<Integer> positions = new ArrayList<>();
        char current = s.charAt(0);
        int position;
        for (int i = 1; i < s.length(); i++) {
            position = s.substring(i).indexOf(current);
            if (position != -1) {
                positions.add(position + i);
            }
            current = s.charAt(i);
        }
        int min = Collections.min(positions);
        return s.charAt(min);
    }
}