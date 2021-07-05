package linkedlist;

public class Node {

    private Object value;
    private Node next;
    private Node prev;

    Node () {

    }

    Node (Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    Node (Object value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public Object getValue() {
        return value;
    }

}
