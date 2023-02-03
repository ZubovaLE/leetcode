package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class InsertPositionTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
                Arguments.of(new int[]{1, 3, 5, 6}, 7, 4)
        );
    }

    @ParameterizedTest
    @DisplayName("Test searchInsert with different arguments")
    @MethodSource("provideParameters")
    void testSearchInsert(int[] nums, int target, int expected) {
        assertEquals(expected, InsertPosition.searchInsert(nums, target));
    }
}