package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5),
                Arguments.of(new int[]{1, 1, 2}, 2)
        );
    }

    @ParameterizedTest
    @DisplayName("Test removeDuplicates with different arguments")
    @MethodSource("provideParameters")
    void testRemoveDuplicates(int[] nums, int expected) {
        assertEquals(expected, RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
    }
}