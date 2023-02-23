package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TwiceAppearingTest {
    private static final TwiceAppearing TWICE_APPEARING = new TwiceAppearing();

    @ParameterizedTest
    @CsvSource(value = {"abccbaacz, c", "abcdd, d"})
    @DisplayName("Test repeatedCharacter with different parameters")
    void repeatedCharacter(String s, char expected) {
        assertEquals(expected, TWICE_APPEARING.repeatedCharacter(s));
    }
}