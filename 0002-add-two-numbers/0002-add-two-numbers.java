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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode current1 = l1, current2 = l2, current = dummy;
        int carry = 0;
        
        while (current1 != null || current2 != null) {
            int c1 = (current1 == null) ? 0 : current1.val;
            int c2 = (current2 == null) ? 0 : current2.val;
            int value = c1 + c2 + carry;
            int digit = value % 10;
            carry = value / 10;
            current.next = new ListNode(digit);
            current = current.next;
            if (current1 != null) current1 = current1.next;
            if (current2 != null) current2 = current2.next;
        }
        if (carry != 0) {
          current.next = new ListNode(carry);
        }
        
        return dummy.next;
    }
}