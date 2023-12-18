import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
	Node<T> head;

	public Stack() {
		head = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public T top() {
		return head.getObject();
	}

	public void push(T element) {
		Node<T> newNode = new Node<T>(element);

		newNode.setNextNode(head);
		head = newNode;
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Der Stack ist leer.");
		} else {
			head = head.getNextNode();
		}
	}

	public void printStack() {
		String printStack = "";
		Node<T> currentNode = head;
		while (currentNode != null) {
			printStack = printStack + " \n " + currentNode.getObject();
			currentNode = currentNode.getNextNode();
		}
		System.out.println(printStack);
	}

	public Iterator<T> iterator() {
		return head.iterator();
	}
}