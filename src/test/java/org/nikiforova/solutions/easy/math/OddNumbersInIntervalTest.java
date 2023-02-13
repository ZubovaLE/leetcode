package org.nikiforova.solutions.easy.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class OddNumbersInIntervalTest {
    private static final OddNumbersInInterval ODD_NUMBERS_IN_INTERVAL = new OddNumbersInInterval();

    @ParameterizedTest
    @CsvSource(value = {"3, 7, 3", "8, 10, 1"})
    @DisplayName("Test countOdds with different parameters")
    void testCountOdds(int low, int high, int expected) {
        assertEquals(expected, ODD_NUMBERS_IN_INTERVAL.countOdds(low, high));
    }
}