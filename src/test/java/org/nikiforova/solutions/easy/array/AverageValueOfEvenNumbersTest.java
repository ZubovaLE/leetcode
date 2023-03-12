package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AverageValueOfEvenNumbersTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 6, 10, 12, 15}, 9),
                Arguments.of(new int[]{1, 2, 4, 7, 10}, 0),
                Arguments.of(new int[]{4, 4, 9, 10}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test averageValue with different parameters")
    void averageValue(int[] nums, int expected) {
        assertEquals(expected, AverageValueOfEvenNumbers.averageValue(nums));
    }
}