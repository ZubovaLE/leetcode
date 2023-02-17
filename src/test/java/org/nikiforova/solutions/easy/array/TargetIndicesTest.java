package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class TargetIndicesTest {
    private static final TargetIndices TARGET_INDICES = new TargetIndices();

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 5, 2, 3}, 2, List.of(1, 2)),
                Arguments.of(new int[]{1, 2, 5, 2, 3}, 3, List.of(3)),
                Arguments.of(new int[]{1, 2, 5, 2, 3}, 5, List.of(4))
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test targetIndices with different parameters")
    void targetIndices(int[] nums, int target, List<Integer> expected) {
        assertThat(TARGET_INDICES.targetIndices(nums, target)).isEqualTo(expected);
    }
}