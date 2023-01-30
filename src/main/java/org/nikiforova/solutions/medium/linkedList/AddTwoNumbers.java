package org.nikiforova.solutions.medium.linkedList;

public class AddTwoNumbers {
    /**
     * Adds two numbers that are represented by a linked list in reverse order and return the sum as a linked list.
     *
     * @param l1 - a non-empty linked list representing a non-negative number in reverse order
     * @param l2 - a non-empty linked list representing a non-negative number in reverse order
     * @return the sum of the two numbers as a linked list
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode one = l1;
        ListNode two = l2;
        ListNode preHead = new ListNode();
        ListNode current = preHead;
        int sum;
        boolean addOneToSum = false;
        while (one != null && two != null) {
            sum = addOneToSum ? one.val + two.val + 1 : one.val + two.val;
            if (sum > 9) {
                current.next = new ListNode(sum % 10);
                addOneToSum = true;
            } else {
                current.next = new ListNode(sum);
                addOneToSum = false;
            }
            one = one.next;
            two = two.next;
            current = current.next;
        }
        if (one == null && two == null) {
            if (addOneToSum) {
                current.next = new ListNode(1);
            }
            return preHead.next;
        }
        current.next = one == null ? getRemainingNodes(two, addOneToSum) : getRemainingNodes(one, addOneToSum);
        return preHead.next;
    }

    private static ListNode getRemainingNodes(ListNode start, boolean addOneToSum) {
        ListNode preHead = new ListNode();
        ListNode current = preHead;
        while (start != null) {
            start.val = addOneToSum ? start.val + 1 : start.val;
            if (start.val > 9) {
                current.next = new ListNode(start.val % 10);
                addOneToSum = true;
            } else {
                current.next = new ListNode(start.val);
                addOneToSum = false;
            }
            current = current.next;
            start = start.next;
        }
        if (addOneToSum) current.next = new ListNode(1);
        return preHead.next;
    }
}
