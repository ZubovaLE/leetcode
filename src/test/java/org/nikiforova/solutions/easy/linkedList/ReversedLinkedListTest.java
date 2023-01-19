package org.nikiforova.solutions.easy.linkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReversedLinkedListTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))))),
                        new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1, null)))))),
                Arguments.of(new ListNode(1, new ListNode(2, null)),
                        new ListNode(2, new ListNode(1, null))),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test reverseList with different parameters")
    void reverseList(ListNode head, ListNode expected) {
        ListNode result = ReversedLinkedList.reverseList(head);
        assertEquals(expected, result);
    }
}