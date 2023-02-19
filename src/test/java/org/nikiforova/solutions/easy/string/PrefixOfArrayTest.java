package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PrefixOfArrayTest {
    private final static PrefixOfArray PREFIX_OF_ARRAY = new PrefixOfArray();

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("iloveleetcode", new String[]{"i", "love", "leetcode", "apples"}, true),
                Arguments.of("iloveleetcode", new String[]{"apples", "i", "love", "leetcode"}, false),
                Arguments.of("a", new String[]{"aa", "aaa", "aaaa"}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test isPrefixString with different parameters")
    void testIsPrefixString(String s, String[] words, boolean expected) {
        assertEquals(expected, PREFIX_OF_ARRAY.isPrefixString(s, words));
    }
}