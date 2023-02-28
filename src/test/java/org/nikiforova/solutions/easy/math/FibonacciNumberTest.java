package org.nikiforova.solutions.easy.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    @ParameterizedTest
    @CsvSource(value = {"2, 1", "3, 2", "4, 3"})
    @DisplayName("Test fib with different parameters")
    void fib(int n, int expected) {
        assertEquals(expected, FibonacciNumber.fib(n));
    }
}