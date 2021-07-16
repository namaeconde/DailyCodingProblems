import org.junit.Test;

public class TestTwoNumbers {

    @Test
    public void testValidInput() {
        TwoNumbers.ListNode l1 = new TwoNumbers.ListNode(2,
                                 new TwoNumbers.ListNode(4,
                                 new TwoNumbers.ListNode(3)));

        TwoNumbers.ListNode l2 = new TwoNumbers.ListNode(5,
                new TwoNumbers.ListNode(6,
                        new TwoNumbers.ListNode(4)));

        TwoNumbers.ListNode sum = TwoNumbers.add(l1, l2);

        assert sum.val == 7;
        assert sum.next.val == 0;
        assert sum.next.next.val == 8;
    }
}
