package org.nikiforova.solutions.medium.linkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4))),
                        new ListNode(7, new ListNode(0, new ListNode(8)))),
                Arguments.of(new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))),
                        new ListNode(9, new ListNode(9)),
                        new ListNode(8, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(1)))))),
                Arguments.of(new ListNode(0),
                        new ListNode(0),
                        new ListNode(0)),
                Arguments.of(new ListNode(5),
                        new ListNode(5),
                        new ListNode(0, new ListNode(1)))
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    @DisplayName("Test addTwoNumbers with different parameters")
    void testAddTwoNumbers(ListNode l1, ListNode l2, ListNode expected) {
        assertEquals(expected, AddTwoNumbers.addTwoNumbers(l1, l2));
    }
}