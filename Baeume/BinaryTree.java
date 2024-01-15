public class BinaryTree<T>{
	//Referenzen auf Knoten
	private Node<T> root;

	public BinaryTree(){
		root = null;
	}

	public Node<T> getRoot(){
		return root;
	}

	public void createTestTree(T value1, T value2, T value3, T value4, T value5){
		root = new Node<T>(value1);
		Node<T> node1 = new Node<T>(value2);
		Node<T> node2 = new Node<T>(value3);
		Node<T> node3 = new Node<T>(value4);
		Node<T> node4 = new Node<T>(value5);
		root.setLeft(node1);
		root.setRight(node2);
		node2.setLeft(node3);
		node2.setRight(node4);
	}

	public void traversierePreorder(Node<T> root){
		System.out.println(root.getObject());
		if (root.getLeft() != null) {
			traversierePreorder(root.getLeft());
		}
		if (root.getRight() != null) {
			traversierePreorder(root.getRight());
		}
	}

    public void traversiereInorder(Node<T> root){
		if (root.getLeft() != null) {
			traversierePreorder(root.getLeft());
		}
		System.out.println(root.getObject());
		if (root.getRight() != null) {
			traversierePreorder(root.getRight());
		}
    }

    public void traversierePostorder(Node<T> root){
		if (root.getLeft() != null) {
			traversierePreorder(root.getLeft());
		}
		if (root.getRight() != null) {
			traversierePreorder(root.getRight());
		}
		System.out.println(root.getObject());
    }


    public static void main(String[] args){
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		binaryTree.createTestTree(
			Integer.valueOf(5), 
			Integer.valueOf(3), 
			Integer.valueOf(7), 
			Integer.valueOf(6), 
			Integer.valueOf(8)
		);

		System.out.println("Preorder-Traversierung: ");
		binaryTree.traversierePreorder(binaryTree.getRoot());
		System.out.println("\nInorder-Traversierung: ");
		binaryTree.traversiereInorder(binaryTree.getRoot());
		System.out.println("\nPostorder-Traversierung: ");
		binaryTree.traversierePostorder(binaryTree.getRoot());
    }    
}