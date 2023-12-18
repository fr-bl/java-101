
public class Node<T> {
	private Node<T> nextNode;
	private Node<T> prevNode;
	private T obj;

	public Node(T pObj) {
		nextNode = null;
		prevNode = null;
		obj = pObj;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public Node<T> getPrevNode() {
		return prevNode;
	}

	public void setNextNode(Node<T> pNextNode) {
		nextNode = pNextNode;
	}

	public void setPrevNode(Node<T> pPrevNode) {
		prevNode = pPrevNode;
	}

	public T getObject() {
		return obj;
	}
}