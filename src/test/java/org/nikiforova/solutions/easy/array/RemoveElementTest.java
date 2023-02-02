package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 2, 3}, 3, 2),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void removeElement(int[] nums, int val, int expected) {
        assertEquals(expected, RemoveElement.removeElement(nums, val));
    }
}