package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PrefixReversingTest {

    @ParameterizedTest
    @CsvSource(value = {"abcdefd, d, dcbaefd", "xyxzxe, z, zxyxxe", "abcd, z, abcd"})
    void reversePrefix(String word, char ch, String expected) {
        assertEquals(expected, PrefixReversing.reversePrefix(word, ch));
    }
}