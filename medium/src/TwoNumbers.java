/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 */
public class TwoNumbers {

    public static class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public static ListNode add(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode head = new ListNode(0);
        ListNode prev = head;
        ListNode runner = head;
        while (l1 != null || l2 != null) {
            if (runner == null) {
                runner = new ListNode(0);
                prev.next = runner;
            }

            int sum = runner.val;
            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }

            runner.val = sum;
            if (sum >= 10) {
                runner.val = sum - 10;
                runner.next = new ListNode(1);
            }

            prev = runner;
            runner = runner.next;
        }

        return head;
    }
}
