package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCommonValueTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{2, 4}, 2),
                Arguments.of(new int[]{1, 2, 3, 6}, new int[]{2, 3, 4, 5}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test getCommon with different parameters")
    void getCommon(int[] nums1, int[] nums2, int expected) {
        assertEquals(expected, MinimumCommonValue.getCommon(nums1, nums2));
    }
}