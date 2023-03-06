package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PercentageOfLetterInStringTest {

    @ParameterizedTest
    @CsvSource(value = {"vmvvvvvzrvvpvdvvvvyfvdvvvvpkvvbvvkvvfkvvvkvbvvnvvomvzvvvdvvvkvvvvvvvvvlvcvilaqvvhoevvlmvhvkvtgwfvvzy, v, 59",
            "foobar, o, 33", "jjjj, k, 0", "sgawtb, s, 16"})
    @DisplayName("Test percentageLetter with different parameters")
    void percentageLetter(String s, char letter, int expected) {
        assertEquals(expected, PercentageOfLetterInString.percentageLetter(s, letter));
    }
}