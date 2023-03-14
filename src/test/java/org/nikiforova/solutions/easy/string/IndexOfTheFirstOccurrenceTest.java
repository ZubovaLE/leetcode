package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IndexOfTheFirstOccurrenceTest {

    @ParameterizedTest
    @CsvSource(value = {"sadbutsad, sad, 0", "leetcode, leeto, -1", "mississippi, issip, 4"})
    @DisplayName("Test strStr with different parameters")
    void strStr(String haystack, String needle, int expected) {
        assertEquals(expected, IndexOfTheFirstOccurrence.strStr(haystack, needle));
    }
}