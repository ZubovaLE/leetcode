package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FinalValueOfVariableTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new String[]{"--X", "X++", "X++"}, 1),
                Arguments.of(new String[]{"++X", "++X", "X++"}, 3),
                Arguments.of(new String[]{"X++", "++X", "--X", "X--"}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test finalValueAfterOperations with different parameters")
    void testFinalValueAfterOperations(String[] operations, int expected) {
        assertEquals(expected, FinalValueOfVariable.finalValueAfterOperations(operations));
    }
}