/**
 * Merge two sorted linked lists and return it as a sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 *
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 */
public class MergeTwoSortedLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null && l2 != null) {
            return l2;
        }

        if (l1 != null && l2 == null) {
            return l1;
        }

        ListNode sorted = l1;
        ListNode prev = sorted;
        while (l2 != null) {
            if (prev.next != null) {
                if (prev.next.val <= l2.val) {
                    prev = prev.next;
                } else {
                    if (prev.val <= l2.val) {
                        ListNode newNode = new ListNode(l2.val, prev.next);
                        prev.next = newNode;
                        prev = newNode;
                    } else {
                        ListNode newNode = new ListNode(l2.val, prev);
                        sorted = newNode;
                        prev = newNode;
                    }
                    l2 = l2.next;
                }
            } else {
                if (prev.val <= l2.val) {
                    prev.next = l2;
                    break;
                } else {
                    ListNode newNode = new ListNode(l2.val, prev);
                    sorted = newNode;
                    prev = newNode;
                    l2 = l2.next;
                }
            }
        }

        return sorted;
    }
}
