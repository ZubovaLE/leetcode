package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EquivalentStringsTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new String[]{"ab", "c"}, new String[]{"a", "bc"}, true),
                Arguments.of(new String[]{"a", "cb"}, new String[]{"ab", "c"}, false),
                Arguments.of(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test arrayStringsAreEqual with different parameters")
    void testArrayStringsAreEqual(String[] word1, String[] word2, boolean expected) {
        assertEquals(expected, EquivalentStrings.arrayStringsAreEqual(word1, word2));
    }
}