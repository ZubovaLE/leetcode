package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest {
    @ParameterizedTest
    @DisplayName("Test detectCapitalUse with different parameters")
    @CsvSource(value = {"USA, true", "FlaG, false", "Good, true", "flAg, false"})
    void detectCapitalUse(String word, boolean expected) {
        boolean result = DetectCapital.detectCapitalUse(word);
        assertEquals(expected, result);
    }
}