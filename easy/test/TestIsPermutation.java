import org.junit.Test;

public class TestIsPermutation {

    @Test
    public void testIsPermutation() {
        assert IsPermutation.check("cat", "tac");
        assert IsPermutation.check("1001", "0011");
        assert IsPermutation.check("coffee", "fefeoc");
    }

    @Test
    public void testNotPermutation() {
        assert !IsPermutation.check("day", "dea");
        assert !IsPermutation.check("day", "day");
    }
}
