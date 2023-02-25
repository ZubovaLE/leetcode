package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PrefixesOfAGivenStringTest {
    private final static PrefixesOfAGivenString PREFIXES_OF_A_GIVEN_STRING = new PrefixesOfAGivenString();

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new String[]{"a", "b", "c", "ab", "bc", "abc"}, "abc", 3),
                Arguments.of(new String[]{"a", "a"}, "aa", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test countPrefixes with different parameters")
    void countPrefixes(String[] words, String s, int expected) {
        assertEquals(expected, PREFIXES_OF_A_GIVEN_STRING.countPrefixes(words, s));
    }
}