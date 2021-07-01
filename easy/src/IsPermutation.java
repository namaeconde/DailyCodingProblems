import java.util.HashMap;

/**
 * Check Permutation: Given two strings,
 * write a method to decide if one is a permutation of the other.
 */
public class IsPermutation {

    public static boolean check(String str1, String str2) {
        if (str1.contains(str2)) return false; // two strings are exactly the same
        if (str1.length() != str2.length()) return false; // two strings not the same length

        HashMap<Character, Integer> charactersMap = new HashMap();
        for (int i=0; i<str1.length(); i++) {
            char key = str1.charAt(i);
            int count = 0;
            if (charactersMap.get(key) != null) {
                count = charactersMap.get(key);
            }
            charactersMap.put(key, count+1);
        }

        for (int i=0; i<str2.length(); i++) {
            char key = str2.charAt(i);
            if (charactersMap.get(key) == null || charactersMap.get(key) <= 0) {
                return false;
            }
            charactersMap.put(key, charactersMap.get(key)-1);
        }
        return true;
    }
}
