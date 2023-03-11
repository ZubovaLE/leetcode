package org.nikiforova.solutions.easy.dates;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DateReformattingTest {

    @ParameterizedTest
    @CsvSource(value = {"20th Oct 2052, 2052-10-20", "6th Jun 1933, 1933-06-06", "26th May 1960, 1960-05-26"})
    @DisplayName("Test dayOfTheWeek with different parameters")
    void reformatDate(String date, String expected) {
        assertEquals(expected, DateReformatting.reformatDate(date));
    }
}