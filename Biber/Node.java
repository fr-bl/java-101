import java.util.Iterator;

public class Node<T> implements Iterable<T> {
    private Node<T> nextNode;
    private T obj;

    public Node(T pObj) {
        nextNode = null;
        obj = pObj;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> pNextNode) {
        nextNode = pNextNode;
    }

    public T getObject() {
        return obj;
    }

    public Iterator<T> iterator() {
        return new NodeIterator<T>(this);
    }
}

class NodeIterator<T> implements Iterator<T> {
    Node<T> node;

    NodeIterator(Node<T> node) {
        // initialize cursor
        this.node = node;
    }

    public boolean hasNext() {
        return node != null;
    }

    public T next() {
        Node<T> previous = node;
        node = node == null ? null : node.getNextNode();
        return previous.getObject();
    }
}