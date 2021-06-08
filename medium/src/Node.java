public class Node {

    String value;
    Node left;
    Node right;

    Node (String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    Node (String value, Node left) {
        this.value = value;
        this.left = left;
        this.right = null;
    }


    Node (String value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
