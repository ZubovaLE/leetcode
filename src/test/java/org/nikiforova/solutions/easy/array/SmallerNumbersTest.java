package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SmallerNumbersTest {
    private final static SmallerNumbers smallerNumbers = new SmallerNumbers();

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{8, 1, 2, 2, 3}, new int[]{4, 0, 1, 1, 3}),
                Arguments.of(new int[]{6, 5, 4, 8}, new int[]{2, 1, 0, 3}),
                Arguments.of(new int[]{7, 7, 7, 7}, new int[]{0, 0, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test smallerNumbersThanCurrent with different parameters")
    void smallerNumbersThanCurrent(int[] nums, int[] expected) {
        assertArrayEquals(expected, smallerNumbers.smallerNumbersThanCurrent(nums));
    }
}