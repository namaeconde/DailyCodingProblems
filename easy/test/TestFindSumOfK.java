import org.junit.Test;

public class TestFindSumOfK {

    @Test
    public void testValidInputWithSumOfK() {
        assert FindSumOfK.solution2HasSumOfK(new int[] {10, 15, 3, 7}, 17);
    }

    @Test
    public void testInValidInput() {
        assert !FindSumOfK.solution2HasSumOfK(new int[] {-1, -1, -1}, 2);
    }

}
