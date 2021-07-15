import org.junit.Test;

public class TestRemoveDuplicatesSorted {

    @Test
    public void testValidDuplicates() {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        int[] expected = new int[] {0,1,2,3,4};

        int k = RemoveDuplicatesSortedArray.removeDuplicates(nums);
        assert k == expected.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expected[i];
        }
    }
}
