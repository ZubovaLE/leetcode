package org.nikiforova.solutions.easy.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;;

class SortingPeopleTest {
    private final SortingPeople SORTING_PEOPLE = new SortingPeople();

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170}, new String[]{"Mary", "Emma", "John"}),
                Arguments.of(new String[]{"Alice", "Bob", "Bob"}, new int[]{155, 185, 150}, new String[]{"Bob", "Alice", "Bob"})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test sortPeople with different parameters")
    void testSortPeople(String[] names, int[] heights, String[] expected) {
        assertArrayEquals(expected, SORTING_PEOPLE.sortPeople(names, heights));
    }
}