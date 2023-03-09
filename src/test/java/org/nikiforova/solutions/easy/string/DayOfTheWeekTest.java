package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.nikiforova.solutions.easy.dates.DayOfTheWeek;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekTest {

    @ParameterizedTest
    @CsvSource(value = {"31, 8, 2019, Saturday", "18, 7, 1999, Sunday", "15, 8, 1993, Sunday"})
    @DisplayName("Test dayOfTheWeek with different parameters")
    void dayOfTheWeek(int day, int month, int year, String expected) {
        assertEquals(expected, DayOfTheWeek.dayOfTheWeek(day, month, year));
    }
}