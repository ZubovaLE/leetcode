package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    private static final MajorityElement MAJORITY_ELEMENT = new MajorityElement();

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test majorityElement with different parameters")
    void testMajorityElement(int[] nums, int expected) {
        assertEquals(expected, MAJORITY_ELEMENT.majorityElement(nums));
    }
}