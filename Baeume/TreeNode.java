public class TreeNode<T> {
	private TreeNode<T> left;
	private TreeNode<T> right;
	private T obj;

	public TreeNode(T pObj) {
		left = null;
		right = null;
		obj = pObj;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setLeft(TreeNode<T> pLeft) {
		left = pLeft;
	}

	public void setRight(TreeNode<T> pRight) {
		right = pRight;
	}

	public T getObject() {
		return obj;
	}
}