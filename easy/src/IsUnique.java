/**
 * Is Unique: Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
public class IsUnique {

    public static boolean check(String input) {
        String temp = "";

        for (int i=0; i<input.length(); i++) {
            String inputChar = Character.toString(input.charAt(i));
            if (temp.contains(inputChar)) {
                return false;
            }
            temp += inputChar;
        }
        return true;
    }

    // Cracking the coding interview answer
    public static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }

}
