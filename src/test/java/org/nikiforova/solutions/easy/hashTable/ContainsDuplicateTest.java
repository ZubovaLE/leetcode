package org.nikiforova.solutions.easy.hashTable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, true),
                Arguments.of(new int[]{1, 2, 3, 4}, false),
                Arguments.of(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true),
                Arguments.of(new int[]{1}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test containsDuplicate with different arguments")
    void containsDuplicate(int[] nums, boolean expected) {
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertEquals(expected, result);
    }
}