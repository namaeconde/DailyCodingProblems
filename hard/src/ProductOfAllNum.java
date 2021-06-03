import java.util.ArrayList;
import java.util.List;

public class ProductOfAllNum {

    /**
     * On
     *
     * @param numbers
     * @return
     */
    public static List getProducts(List<Integer> numbers) {
        List<Integer> products = new ArrayList<Integer>();
        int totalProduct = 1;
        for (int number : numbers) {
            totalProduct = totalProduct * number;
        }

        for (int number : numbers) {
            products.add(totalProduct/number);
        }

        return products;
    }
}