package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ReplacingUppercaseWithLowercaseTest {
    private final static ReplacingUppercaseWithLowercase REPLACING_UPPERCASE_WITH_LOWERCASE = new ReplacingUppercaseWithLowercase();

    @ParameterizedTest
    @CsvSource(value = {"Hello, hello", "here, here", "LOVELY, lovely"})
    @DisplayName("Test toLowerCase with different parameters")
    void toLowerCase(String s, String expected) {
        assertEquals(expected, REPLACING_UPPERCASE_WITH_LOWERCASE.toLowerCase(s));
    }
}