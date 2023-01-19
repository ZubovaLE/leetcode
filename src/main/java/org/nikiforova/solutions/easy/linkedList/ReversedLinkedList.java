package org.nikiforova.solutions.easy.linkedList;

public class ReversedLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode currentNode = head.next;
        ListNode previousNode = new ListNode(head.val, null);
        ListNode tmp;
        while (currentNode.next != null) {
            tmp = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = tmp;
        }
        currentNode.next = previousNode;
        return currentNode;
    }
}
