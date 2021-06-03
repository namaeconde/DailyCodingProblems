import java.util.HashMap;

public class FindSumOfK {

    /**
     * Brute force solution
     * On*n
     *
     * @param input
     * @param k
     * @return
     */
    public static boolean solution1HasSumOfK(int[] input, int k) {
        int keyIndex = 0;
        while (keyIndex < input.length) {
            for (int i=keyIndex+1; i<input.length; i++) {
                int sum = input[keyIndex] + input[i];
                if (sum == k) {
                    return true;
                }
            }
            keyIndex++;
        }
        return false;
    }

    /**
     * Look up table solution
     * On
     *
     * @param input
     * @param k
     * @return
     */
    public static boolean solution2HasSumOfK(int[] input, int k) {
        HashMap pair = new HashMap();
        for (int i=0; i<input.length; i++) {
            int pairOne = k - input[i]; // Get other pair of the sum
            if (pair.containsKey(pairOne)) {
                return true;
            }
            pair.put(input[i], pairOne);
        }
        return false;
    }
}

