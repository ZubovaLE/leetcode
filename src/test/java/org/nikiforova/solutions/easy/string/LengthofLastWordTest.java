package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LengthofLastWordTest {
    @ParameterizedTest
    @DisplayName("Test lengthOfLastWord with different arguments")
    @CsvSource(value = {"Hello World, 5", " fly me to the moon , 4", "luffy is still joyboy, 6", ",0", "hello , 5", "hello, 5"})
    void testLengthOfLastWord(String s, int expected) {
        int result = LengthofLastWord.lengthOfLastWord(s);
        assertEquals(expected, result);
    }
}