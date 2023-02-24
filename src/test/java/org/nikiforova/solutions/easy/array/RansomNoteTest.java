package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @ParameterizedTest
    @CsvSource(value = {"a, b, false", "aa, ab, false", "aa, aab, true"})
    @DisplayName("Test canConstruct with different parameters")
    void canConstruct(String ransomNote, String magazine, boolean expected) {
        assertEquals(expected, RansomNote.canConstruct(ransomNote, magazine));
    }
}