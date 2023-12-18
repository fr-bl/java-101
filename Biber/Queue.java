import java.util.Iterator;

public class Queue<T> implements Iterable<T> {

	Node<T> head;
	Node<T> tail;

	public Queue() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public T front() {
		return head.getObject();
	}

	public void enqueue(T element) {
		Node<T> newNode = new Node<T>(element);

		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNextNode(newNode);
			tail = newNode;
		}
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Die Warteschlange ist leer.");
		} else if (head == tail) {
			head = null;
			tail = null;
		} else {
			head = head.getNextNode();
		}
	}

	public void printQueue() {
		String printQueue = "";
		Node<T> currentNode = head;
		while (currentNode != null) {
			printQueue = printQueue + " -> " + currentNode.getObject();
			currentNode = currentNode.getNextNode();
		}
		System.out.println(printQueue);
	}

	public Iterator<T> iterator() {
		return head.iterator();
	}
}
