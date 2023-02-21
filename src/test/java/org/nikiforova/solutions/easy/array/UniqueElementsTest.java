package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UniqueElementsTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 2}, 4),
                Arguments.of(new int[]{1, 1, 1, 1, 1}, 0),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void sumOfUnique(int[] nums, int expected) {
        assertEquals(expected, UniqueElements.sumOfUnique(nums));
    }
}