package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheYearTest {

    @ParameterizedTest
    @CsvSource(value = {"2019-01-09, 9", "2019-02-10, 41"})
    @DisplayName("Test dayOfYear with different parameters")
    void dayOfYear(String date, int expected) {
        assertEquals(expected, DayOfTheYear.dayOfYear(date));
    }
}