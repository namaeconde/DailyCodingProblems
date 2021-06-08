/**
 * Given the root to a binary tree, implement serialize(root),
 * which serializes the tree into a string, and deserialize(s),
 * which deserializes the string back into the tree. *
 */
public class BinaryTree {

    public static Node deserialize(String binaryTreeStr) {
        if (binaryTreeStr.length() == 0) return null;

        String arr[] = binaryTreeStr.split(",");
        return helper(arr, 0);
    }

    public static Node helper(String binaryTreeStr[], int startIndex) {
        if (binaryTreeStr[startIndex].equals("#")) {
            return null;
        }

        Node node = new Node(binaryTreeStr[startIndex]);
        startIndex++;
        node.left = helper(binaryTreeStr, startIndex);
        startIndex++;
        node.right = helper(binaryTreeStr, startIndex);
        return node;
    }

    public static String serialize(Node root) {
        if (root == null) return "#";

        String left = serialize(root.left);
        String right = serialize(root.right);

        if (left.length() > 0) {
            left = "," + left;
        }

        if (right.length() > 0) {
            right = "," + right;
        }

        return root.value + left + right;
    }
}
