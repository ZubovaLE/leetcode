package org.nikiforova.solutions.easy.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @ParameterizedTest
    @DisplayName("Test isPalindrome with different arguments")
    @CsvSource(value = {"121, true", "-121, false", "10, false", "0, true"})
    void isPalindrome(int x, boolean expected) {
        assertEquals(expected, PalindromeNumber.isPalindrome(x));
    }
}