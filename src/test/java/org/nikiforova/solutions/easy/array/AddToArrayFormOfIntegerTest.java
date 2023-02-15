package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class AddToArrayFormOfIntegerTest {
    private final AddToArrayFormOfInteger addToArrayFormOfInteger = new AddToArrayFormOfInteger();

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 0, 0}, 34, List.of(1, 2, 3, 4)),
                Arguments.of(new int[]{2, 7, 4}, 181, List.of(4, 5, 5)),
                Arguments.of(new int[]{2, 1, 5}, 806, List.of(1, 0, 2, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test addToArrayForm with different parameters")
    void testAddToArrayForm(int[] num, int k, List<Integer> expected) {
        assertThat(addToArrayFormOfInteger.addToArrayForm(num, k)).isEqualTo(expected);
    }
}