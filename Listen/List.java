public class List<T> {

	// Referenzen auf Knoten
	private Node<T> first;
	private Node<T> last;
	private Node<T> current;

	public List() {
		first = null;
		last = null;
		current = null;
	}

	public boolean isEmpty() {
		return first == null && last == null;
	}

	public void append(T element) {
		Node<T> newNode = new Node<T>(element);
		if (isEmpty()) {
			first = newNode;
			last = newNode;
			current = newNode;
		} else {
			last.setNextNode(newNode);
			newNode.setPrevNode(last);
			last = newNode;
		}
	}

	public void insert(T element) {
		Node<T> newNode = new Node<T>(element);
		if (isEmpty()) {
			first = newNode;
			last = newNode;
			current = newNode;
		} else {
			Node<T> nextNode = current.getNextNode();
			if (nextNode != null) {
				nextNode.setPrevNode(newNode);
				newNode.setNextNode(nextNode);
			} else {
				last = newNode;
			}

			current.setNextNode(newNode);
			newNode.setPrevNode(current);

			current = newNode;
		}
	}

	public void remove() {
		Node<T> prevNode = current.getPrevNode();
		Node<T> nextNode = current.getNextNode();
		if (prevNode != null) {
			prevNode.setNextNode(nextNode);
			current = prevNode;
		} else {
			first = nextNode;
		}
		if (nextNode != null) {
			nextNode.setPrevNode(prevNode);
			current = nextNode;
		} else {
			last = prevNode;
		}
	}

	public void toFirst() {
		current = first;
	}

	public void toLast() {
		current = last;
	}

	public void next() {
		if (current != null && current.getNextNode() != null) {
			current = current.getNextNode();
		}
	}

	public void prev() {
		if (current != null && current.getPrevNode() != null) {
			current = current.getPrevNode();
		}
	}

	public T getCurrent() {
		if (current == null) {
			return null;
		} else {
			return current.getObject();
		}
	}

	public void printList() {
		String printList = "[";
		Node<T> currentNode = first;
		while (currentNode != null && currentNode.getNextNode() != null) {
			printList = printList + currentNode.getObject() + ", ";
			currentNode = currentNode.getNextNode();
		}
		if (currentNode != null) {
			printList = printList + currentNode.getObject();
		}
		printList = printList + "]";
		System.out.println(printList);
	}

	public static void main(String[] args) {
		List<Vokabel> list = new List<Vokabel>();
		list.append(new Vokabel("Haus", "house"));
		list.printList();

		list.append(new Vokabel("Auto", "car"));
		list.printList();

		list.toFirst();
		list.insert(new Vokabel("Liste", "list"));
		list.printList();

		list.insert(new Vokabel("Informatik", "computer science"));
		list.printList();

		list.toFirst();
		list.next();
		list.remove();
		list.printList();
	}
}
