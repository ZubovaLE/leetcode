package org.nikiforova.solutions.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    @ParameterizedTest
    @DisplayName("Test lengthOfLongestSubstring with different arguments")
    @CsvSource(value = {"abcabcbb, 3", "bbbbb, 1", "pwwkew, 3", "dvdf, 3", "a, 1"})
    void testLengthOfLongestSubstring(String s, int expected) {
        assertEquals(expected, LongestSubstring.lengthOfLongestSubstring(s));
    }
}