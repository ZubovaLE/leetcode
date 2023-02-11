package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class XOROperationInArrayTest {
    private final static XOROperationInArray xorOperationInArray = new XOROperationInArray();

    @ParameterizedTest
    @CsvSource(value = {"5, 0, 8", "4, 3, 8"})
    @DisplayName("Test xorOperation with different parameters")
    void testXorOperation(int n, int start, int expected) {
        assertEquals(expected, xorOperationInArray.xorOperation(n, start));
    }
}