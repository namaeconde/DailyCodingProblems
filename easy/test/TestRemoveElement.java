import org.junit.Test;

import java.util.Arrays;

public class TestRemoveElement {

    @Test
    public void testValidInput() {
        int[] nums = new int[] {3,2,2,3};
        int[] expected = new int[] {2,2};
        int k = RemoveElement.removeElement(nums, 3);
        assert k == expected.length;
        Arrays.sort(nums, 0, k);
        for (int i = 0; i < expected.length; i++) {
            assert nums[i] == expected[i];
        }
    }
}
