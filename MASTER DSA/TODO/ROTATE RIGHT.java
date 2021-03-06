/**
Rotate List
Given the head of a linked list, rotate the list to the right by k places.

Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
 */


class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode c1 = head;
        ListNode c2 = head;
        int len = 0;
        while (c1 != null) {
            len++;
            c1 = c1.next;
        }

        c1 = head;
        k = k % len;

        while (k-- > 0)
            c2 = c2.next;

        while (c2.next != null) {
            c1 = c1.next;
            c2 = c2.next;
        }

        c2.next = head;
        head = c1.next;
        c1.next = null;

        return head;
    }
}

