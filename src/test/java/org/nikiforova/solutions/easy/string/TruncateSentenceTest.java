package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TruncateSentenceTest {
    @ParameterizedTest
    @CsvSource(value = {"Hello how are you Contestant, 4, Hello how are you", "What is the solution to this problem, 4, What is the solution",
            "chopper is not a tanuki, 5, chopper is not a tanuki"})
    @DisplayName("Test fib with different parameters")
    void truncateSentence(String s, int k, String expected) {
        assertEquals(expected, TruncateSentence.truncateSentence(s, k));
    }
}