package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WordsReversingTest {

    @ParameterizedTest
    @CsvSource(value = {"Let's take LeetCode contest, s'teL ekat edoCteeL tsetnoc", "God Ding, doG gniD"})
    @DisplayName("Test reverseWords with different parameters")
    void reverseWords(String s, String expected) {
        assertEquals(expected, WordsReversing.reverseWords(s));
    }
}