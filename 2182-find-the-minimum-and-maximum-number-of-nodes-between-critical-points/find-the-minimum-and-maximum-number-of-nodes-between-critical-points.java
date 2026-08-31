/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first = -1;
        int prev = -1;
        int min = Integer.MAX_VALUE;
        int max = -1;

        ListNode p = head;
        ListNode c = head.next;
        int pos = 1;

        while (c != null && c.next != null) {
            if ((c.val > p.val && c.val > c.next.val) ||
                (c.val < p.val && c.val < c.next.val)) {

                if (first == -1) {
                    first = pos;
                } else {
                    min = Math.min(min, pos - prev);
                    max = Math.max(max, pos - first);
                }

                prev = pos;
            }

            p = c;
            c = c.next;
            pos++;
        }

        if (min == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }

        return new int[]{min, max};
    }
}