package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumbersDisappearedInArrayTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 2, 7, 8, 2, 3, 1}, List.of(5, 6)),
                Arguments.of(new int[]{1, 1}, List.of(2))
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test findDisappearedNumbers with different parameters")
    void findDisappearedNumbers(int[] nums, List<Integer> expected) {
        assertEquals(expected, NumbersDisappearedInArray.findDisappearedNumbers(nums));
    }
}