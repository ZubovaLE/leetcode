package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {
    private static final SquaresOfASortedArray SQUARES_OF_A_SORTED_ARRAY = new SquaresOfASortedArray();

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100}),
                Arguments.of(new int[]{-7, -3, 2, 3, 11}, new int[]{4, 9, 9, 49, 121})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test sortedSquares with different parameters")
    void sortedSquares(int[] nums, int[] expected) {
        assertArrayEquals(expected, SQUARES_OF_A_SORTED_ARRAY.sortedSquares(nums));
    }
}