package org.nikiforova.solutions.easy.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SubtractProductAndSumTest {

    @ParameterizedTest
    @CsvSource(value = {"234, 15", "4421, 21", "8, 0"})
    void subtractProductAndSum(int n, int expected) {
        assertEquals(expected, SubtractProductAndSum.subtractProductAndSum(n));
    }
}