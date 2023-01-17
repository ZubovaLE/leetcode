package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{-1, 3, 5}, 4, new int[]{0, 2}),
                Arguments.of(new int[]{0, 0, 0}, 0, new int[]{0, 1}),
                Arguments.of(new int[]{1, 2}, 0, null)
        );
    }

    @ParameterizedTest
    @DisplayName("Test twoSum with different arguments")
    @MethodSource("provideParameters")
    void testTwoSum(int[] nums, int target, int[] expected) {
        int[] result = TwoSum.twoSum(nums, target);
        assertArrayEquals(result, expected);
    }

    @DisplayName("Test twoSum when invalid parameter then get IllegalArgumentException")
    @Test
    void testTwoSumWhenInvalidParameterThenGetIllegalArgumentException() {
        int[] nums = new int[]{1};
        int target = 1;
        assertThrows(IllegalArgumentException.class, () -> TwoSum.twoSum(nums, target));
    }
}