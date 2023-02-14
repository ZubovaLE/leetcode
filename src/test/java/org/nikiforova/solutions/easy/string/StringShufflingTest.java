package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringShufflingTest {
    private static final StringShuffling STRING_SHUFFLING = new StringShuffling();

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}, "leetcode"),
                Arguments.of("abc", new int[]{0, 1, 2}, "abc"),
                Arguments.of("arc", new int[]{1, 2, 0}, "car")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void restoreString(String s, int[] indices, String expected) {
        assertEquals(expected, STRING_SHUFFLING.restoreString(s, indices));
    }
}