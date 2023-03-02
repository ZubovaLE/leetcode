package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TargetArrayInTheGivenOrderTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}, new int[]{0, 4, 1, 3, 2}),
                Arguments.of(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0}, new int[]{0, 1, 2, 3, 4}),
                Arguments.of(new int[]{1}, new int[]{0}, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test createTargetArray with different parameters")
    void createTargetArray(int[] nums, int[] index, int[] expected) {
        assertArrayEquals(expected, TargetArrayInTheGivenOrder.createTargetArray(nums, index));
    }
}