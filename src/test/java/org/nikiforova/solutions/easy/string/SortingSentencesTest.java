package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SortingSentencesTest {
    private final static SortingSentences SORTING_SENTENCES = new SortingSentences();

    @ParameterizedTest
    @CsvSource(value = {"is2 sentence4 This1 a3, This is a sentence", "Myself2 Me1 I4 and3, Me Myself and I"})
    @DisplayName("Test sortSentence with different parameters")
    void sortSentence(String s, String expected) {
        assertEquals(expected, SORTING_SENTENCES.sortSentence(s));
    }
}