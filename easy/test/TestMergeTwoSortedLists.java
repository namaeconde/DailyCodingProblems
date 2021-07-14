import org.junit.Test;

public class TestMergeTwoSortedLists {

    @Test
    public void testValidSortedLists() {
        MergeTwoSortedLists.ListNode l1 =
            new MergeTwoSortedLists.ListNode(1,
            new MergeTwoSortedLists.ListNode(2,
            new MergeTwoSortedLists.ListNode(4)));

        MergeTwoSortedLists.ListNode l2 =
                new MergeTwoSortedLists.ListNode(1,
                new MergeTwoSortedLists.ListNode(3,
                new MergeTwoSortedLists.ListNode(4)));

        MergeTwoSortedLists.ListNode sorted = MergeTwoSortedLists.mergeTwoLists(l1, l2);

        assert 1 == sorted.val;
        assert 1 == sorted.next.val;
        assert 2 == sorted.next.next.val;
        assert 3 == sorted.next.next.next.val;
        assert 4 == sorted.next.next.next.next.val;
        assert 4 == sorted.next.next.next.next.next.val;
    }
}
