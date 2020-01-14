package edu.kis.vh.nursery.list;

public class Node {

    private int value;
    private Node prev;
    private Node next;

    /**
     * Contructor for node with value as i
     * @param i - new node value
     */
    public Node(int i) {
        setValue(i);
    }

    /**
     * Gets node value
     * @return Node value
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets node value
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Returns previous Node
     * @return previous Node
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Sets previous node
     * @param prev previous node
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Returns next Node
     * @return next Node
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets next Node
     * @param next next node
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
