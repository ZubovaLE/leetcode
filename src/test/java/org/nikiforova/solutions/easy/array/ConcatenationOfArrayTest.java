package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfArrayTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1}, new int[]{1, 2, 1, 1, 2, 1}),
                Arguments.of(new int[]{1, 3, 2, 1}, new int[]{1, 3, 2, 1, 1, 3, 2, 1}),
                Arguments.of(new int[]{1}, new int[]{1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void getConcatenation(int[] nums, int[] expected) {
        assertArrayEquals(expected, ConcatenationOfArray.getConcatenation(nums));
    }
}