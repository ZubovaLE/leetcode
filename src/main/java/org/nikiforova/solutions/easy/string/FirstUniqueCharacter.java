package org.nikiforova.solutions.easy.string;

import java.util.ArrayList;
import java.util.List;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int sLength = s.length();
        if (sLength == 1) return 0;
        List<Character> blackList = new ArrayList<>();
        List<Character> uniqueChars = new ArrayList<>();
        char current;
        for (int i = 0; i < sLength; i++) {
            current = s.charAt(i);
            if (!uniqueChars.contains(current) && !blackList.contains(current)) {
                uniqueChars.add(current);
            } else if (uniqueChars.contains(current)) {
                uniqueChars.remove(uniqueChars.indexOf(current));
                if (!blackList.contains(current)) {
                    blackList.add(current);
                }
            }
        }
        return uniqueChars.size() > 0 ? s.indexOf(uniqueChars.get(0)) : -1;
    }
}