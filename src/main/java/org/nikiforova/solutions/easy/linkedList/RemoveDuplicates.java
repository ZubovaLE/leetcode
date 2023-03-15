package org.nikiforova.solutions.easy.linkedList;

public class RemoveDuplicates {
    /**
     * Deletes all duplicates such that each element appears only once
     *
     * @param head - the head of a sorted linked list
     * @return the linked list without duplicates, sorted as well
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.next.val == temp.val) {
                temp.next = temp.next.next;
                continue;
            }
            temp = temp.next;
        }
        return head;
    }
}
