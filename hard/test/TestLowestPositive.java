import org.junit.Test;

public class TestLowestPositive {

    @Test
    public void testValidInput() {
        int[] input = new int[] {3, 4, -1, 1};
        int result = LowestPositive.find(input);
        assert result == 2;

        input = new int[] {1, 2, 0};
        result = LowestPositive.find(input);
        assert result == 3;
    }

    @Test
    public void testDuplicates() {
        int[] input = new int[] {2, 2, 2, 5};
        assert LowestPositive.find(input) == 1;

        input = new int[] {1, 1, 1, 4};
        assert LowestPositive.find(input) == 2;
    }
}
