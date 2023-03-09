package org.nikiforova.solutions.easy.dates;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDaysBetweenTwoDatesTest {

    @ParameterizedTest
    @CsvSource(value = {"2019-06-29, 2019-06-30, 1", "2020-01-15, 2019-12-31, 15"})
    @DisplayName("Test daysBetweenDates with different parameters")
    void daysBetweenDates(String date1, String date2, int expected) {
        assertEquals(expected, NumberOfDaysBetweenTwoDates.daysBetweenDates(date1, date2));
    }
}