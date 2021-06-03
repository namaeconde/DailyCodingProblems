import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestProductOfAllNum {

    @Test
    public void testValidInput() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        assert ProductOfAllNum.getProducts(input).equals(Arrays.asList(120, 60, 40, 30, 24));

        input = Arrays.asList(3, 2, 1);
        assert ProductOfAllNum.getProducts(input).equals(Arrays.asList(2, 3, 6));
    }
}
