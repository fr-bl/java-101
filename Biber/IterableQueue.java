import java.util.Iterator;

public class IterableQueue<T> implements Iterable<T> {

	IterableNode<T> head;
	IterableNode<T> tail;

	public IterableQueue() {
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
		IterableNode<T> newNode = new IterableNode<T>(element);

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
		IterableNode<T> currentNode = head;
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
