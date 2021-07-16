/**
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 */
public class Strstr {

    /**
     * 0n where n = haystack length / needle length
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty() || haystack.equals(needle)) {
            return 0;
        }

        int nlen = needle.length();
        int hlen = haystack.length();
        for (int i=0; i<hlen-nlen+1; i++) {
            if (haystack.substring(i, i+nlen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
