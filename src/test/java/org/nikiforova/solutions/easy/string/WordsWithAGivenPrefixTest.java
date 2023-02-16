package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordsWithAGivenPrefixTest {
    private static final WordsWithAGivenPrefix WORDS_WITH_A_GIVEN_PREFIX = new WordsWithAGivenPrefix();

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new String[]{"pay", "attention", "practice", "attend"}, "at", 2),
                Arguments.of(new String[]{"leetcode", "win", "loops", "success"}, "code", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test prefixCount with different parameters")
    void testPrefixCount(String[] words, String prefix, int expected) {
        assertEquals(expected, WORDS_WITH_A_GIVEN_PREFIX.prefixCount(words, prefix));
    }
}