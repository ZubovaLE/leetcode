package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(36.50, new double[]{309.65000, 97.70000}),
                Arguments.of(122.11, new double[]{395.26000, 251.79800})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test convertTemperature with different parameters")
    void testConvertTemperature(double celsius, double[] expected) {
        assertArrayEquals(expected, Temperature.convertTemperature(celsius));
    }
}