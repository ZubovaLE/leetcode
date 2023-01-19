package org.nikiforova.solutions.easy.linkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1, new ListNode(2, new ListNode(4, null))),
                        new ListNode(1, new ListNode(3, new ListNode(4, null))),
                        new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, null))))))),
                Arguments.of(null, null, null),
                Arguments.of(null, new ListNode(0, null), new ListNode(0, null))
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test mergeTwoLists with different parameters")
    void mergeTwoLists(ListNode listOne, ListNode listTwo, ListNode expected) {
        ListNode result = MergeTwoSortedLists.mergeTwoLists(listOne, listTwo);
        assertEquals(expected, result);
    }
}