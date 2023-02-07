package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayFromPermutationTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{0,2,1,5,3,4}, new int[]{0,1,2,4,5,3}),
                Arguments.of(new int[]{5,0,1,2,3,4}, new int[]{4,5,0,1,2,3})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test mostWordsFound with different parameters")
    void buildArray(int[] nums, int[] expected) {
        assertArrayEquals(expected, BuildArrayFromPermutation.buildArray(nums));
    }
}