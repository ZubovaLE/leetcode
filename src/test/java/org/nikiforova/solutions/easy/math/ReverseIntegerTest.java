package org.nikiforova.solutions.easy.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @ParameterizedTest
    @DisplayName("Test reverse with different arguments")
    @CsvSource(value = {"123, 321", "-123, -321", "0, 0", "5, 5", "-5, -5", "120, 21"})
    void testReverse(int x, int expected) {
        assertEquals(expected, ReverseInteger.reverse(x));
    }
}