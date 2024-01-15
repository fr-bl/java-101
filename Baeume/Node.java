public class Node<T> {
	private Node<T> left;
	private Node<T> right;
	private T obj;

	public Node(T pObj) {
		left = null;
		right = null;
		obj = pObj;
	}

	public Node<T> getLeft() {
		return left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setLeft(Node<T> pLeft) {
		left = pLeft;
	}

	public void setRight(Node<T> pRight) {
		right = pRight;
	}

	public T getObject() {
		return obj;
	}
}