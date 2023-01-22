package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TheDifferenceBetweenStringsTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("car", "care", 'e'),
                Arguments.of(" ", "y", 'y'),
                Arguments.of("abc", "adcb", 'd')
        );
    }

    @ParameterizedTest
    @DisplayName("Test findTheDifference with different arguments")
    @MethodSource("provideParameters")
    void findTheDifference(String s, String t, char expected) {
        char result = TheDifferenceBetweenStrings.findTheDifference(s, t);
        assertEquals(expected, result);
    }
}