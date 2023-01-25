package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 1}, 1),
                Arguments.of(new int[]{4, 1, 2, 1, 2}, 4),
                Arguments.of(new int[]{1}, 1)
        );
    }

    @ParameterizedTest
    @DisplayName("Test singleNumber with different arguments")
    @MethodSource("provideParameters")
    void singleNumber(int[] nums, int expected) {
        assertEquals(expected, SingleNumber.singleNumber(nums));
    }
}