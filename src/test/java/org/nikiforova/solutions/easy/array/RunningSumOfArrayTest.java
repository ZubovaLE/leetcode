package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOfArrayTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10}),
                Arguments.of(new int[]{1,1,1,1,1}, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{3,1,2,10,1}, new int[]{3,4,6,16,17}),
                Arguments.of(new int[]{1}, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test runningSum with different parameters")
    void testRunningSum(int[] nums, int[] expected) {
        assertArrayEquals(expected, RunningSumOfArray.runningSum(nums));
    }
}