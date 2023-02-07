package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfWordsTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}, 6),
                Arguments.of(new String[]{"please wait", "continue to fight", "continue to win"}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test mostWordsFound with different parameters")
    void testMostWordsFound(String[] sentences, int expected) {
        assertEquals(expected, MaximumNumberOfWords.mostWordsFound(sentences));
    }
}