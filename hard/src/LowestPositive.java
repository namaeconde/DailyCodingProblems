import java.util.HashMap;

/**
 *
 * Given an array of integers, find the first missing positive integer in linear time and constant space.
 * In other words, find the lowest positive integer that does not exist in the array.
 * The array can contain duplicates and negative numbers as well.
 * For example, the input `[3, 4, -1, 1]` should give `2`. The input `[1, 2, 0]` should give `3`.
 * You can modify the input array in-place.
 */
public class LowestPositive {

    public static int find(int[] input) {
        int marker = input[0];
        int highestNum = input[0];
        HashMap lookupTable = new HashMap();

        for (int i=0; i<input.length; i++) {
            int num = input[i];
            int prevNum = num-1;
            highestNum = highestNum < num ? num : highestNum;
            if (prevNum>0 && marker>=num &&
                    lookupTable.get(marker) == null) {
                marker = num;
                lookupTable.put(marker, prevNum);
            }
        }
        return lookupTable.get(marker) == null ? highestNum+1 :
                (Integer) lookupTable.get(marker);
    }
}
