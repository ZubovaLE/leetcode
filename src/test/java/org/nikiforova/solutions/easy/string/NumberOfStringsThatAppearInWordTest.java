package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStringsThatAppearInWordTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new String[]{"a", "abc", "bc", "d"}, "abc", 3),
                Arguments.of(new String[]{"a", "b", "c"}, "aaaaabbbbb", 2),
                Arguments.of(new String[]{"a", "a", "a"}, "ab", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test numOfStrings with different parameters")
    void numOfStrings(String[] patterns, String word, int expected) {
        assertEquals(expected, NumberOfStringsThatAppearInWord.numOfStrings(patterns, word));
    }
}