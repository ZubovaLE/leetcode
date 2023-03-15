package org.nikiforova.solutions.easy.linkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1, new ListNode(1, new ListNode(2, null))),
                        new ListNode(1, new ListNode(2, null))),
                Arguments.of(
                        new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))),
                        new ListNode(1, new ListNode(2, new ListNode(3))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test deleteDuplicates with different parameters")
    void deleteDuplicates(ListNode head, ListNode expected) {
        assertEquals(expected, RemoveDuplicates.deleteDuplicates(head));
    }
}