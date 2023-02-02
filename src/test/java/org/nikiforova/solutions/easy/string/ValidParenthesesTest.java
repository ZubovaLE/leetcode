package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @ParameterizedTest
    @CsvSource(value = {"(, false", "(), true", "()[]{}, true", "(], false", "({()}), true", "({}[]), true", "(){], false"})
    @DisplayName("Test isValid with different arguments")
    void testIsValid(String s, boolean expected) {
        assertEquals(expected, ValidParentheses.isValid(s));
    }
}