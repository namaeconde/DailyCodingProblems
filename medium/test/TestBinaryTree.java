import org.junit.Test;

public class TestBinaryTree {

    @Test
    public void testBinaryTreeSerialize() {
        Node bt = new Node("root", new Node("left", new Node("left.left")),
                new Node("right"));

        String serializedStr = BinaryTree.serialize(bt);
        Node deserializedNode = BinaryTree.deserialize(serializedStr);

        assert serializedStr.equals("root,left,left.left,#,#,#,right,#,#");
        assert deserializedNode.left.left.value.equals("left.left");
    }
}
