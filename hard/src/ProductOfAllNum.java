import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers, return a new array such that each element
 * at index i of the new array is the product of all the numbers in the
 * original array except the one at i.
 */
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