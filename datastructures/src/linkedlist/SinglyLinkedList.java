package linkedlist;

public class SinglyLinkedList {

    Node head;
    Node tail;

    public SinglyLinkedList() {
        this.head = new Node();
    }

    public void add(Object obj) {
        if (head.getValue() == null) {
            // LinkedList is empty
            this.head.setValue(obj);
            this.tail = head;
        } else {
            Node node = new Node(obj, null, tail);
            tail.setNext(node);
        }
    }

    public Node remove(Object obj) {
        Node node = this.head;
        if (head.getValue() == obj) {
            Node oldHead = this.head;
            this.head = oldHead.getNext();
            oldHead.setNext(null);
            return oldHead;
        }

        while(node.getNext() != null) {
            if (node.getNext().getValue() == obj) {
                Node found = node.getNext();
                node.setNext(found.getNext());
                found.setNext(null);
                return found;
            }
            node = node.getNext();
        }

        return null; // Object not found
    }

}
