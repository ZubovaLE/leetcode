package org.nikiforova.solutions.easy.array;

public class RansomNote {
    /**
     * @param ransomNote - a string
     * @param magazine - a string
     * @return true if ransomNote can be constructed by using the letters from magazine and false otherwise
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        int[] letters = new int[26];
        int index;
        for (char c : ransomNote.toCharArray()) {
            index = magazine.indexOf(c, letters[c - 'a']);
            if (index == -1) {
                return false;
            }
            letters[c - 'a'] = index + 1;
        }
        return true;
    }
}
