package org.nikiforova.solutions.easy.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArraySignTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{-1, -2, -3, -4, 3, 2, 1}, 1),
                Arguments.of(new int[]{1, 5, 0, 2, -3}, 0),
                Arguments.of(new int[]{-1, 1, -1, 1, -1}, -1)
        );
    }

    @ParameterizedTest
    @DisplayName("Test arraySign with different arguments")
    @MethodSource("provideParameters")
    void arraySign(int[] nums, int expected) {
        assertEquals(expected, ArraySign.arraySign(nums));
    }
}