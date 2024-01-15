import java.util.Iterator;

public class IterableNode<T> implements Iterable<T> {
    private IterableNode<T> nextNode;
    private T obj;

    public IterableNode(T pObj) {
        nextNode = null;
        obj = pObj;
    }

    public IterableNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(IterableNode<T> pNextNode) {
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
    IterableNode<T> node;

    NodeIterator(IterableNode<T> node) {
        // initialize cursor
        this.node = node;
    }

    public boolean hasNext() {
        return node != null;
    }

    public T next() {
        IterableNode<T> previous = node;
        node = node == null ? null : node.getNextNode();
        return previous.getObject();
    }
}