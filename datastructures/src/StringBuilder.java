public class StringBuilder {

    char[] value = {};
    private int size;

    public void append(char c) {
        value[size++] = c;
    }

    public void append(String string) {
        for (int i=0; i<string.length(); i++) {
            this.append(string.charAt(i));
        }
    }

    public void deleteCharAt(int index) {
        System.arraycopy(value, index+1, value, index, size-index-1);
        size--;
    }

    public String toString() {
        String string = "";
        for (char c : value) {
            string += Character.toString(c);
        }
        return string;
    }
}
