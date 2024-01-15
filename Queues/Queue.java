public class Queue<T> {

	public class Node<T> {
		// Implementierung der inneren Klasse Node
		private T object;
		private Node<T> next;

		public Node(T object) {
			this.object = object;
		}

		public T getObject() {
			return object;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
	}

	private Node<T> head;
	private Node<T> tail;

	public Queue() {
		// Initialisierung
		head = null;
		tail = null;
	}

	// Prueft, ob die Queue leer ist.
	public boolean isEmpty() {
		return head == null;
	}

	// Gibt das erste Objekt zurueck, ohne es zu entfernen
	public T first() {
		if (isEmpty()) {
			return null;
		} else {
			return head.getObject();
		}
	}

	// Fuegt am Ende ein Element ein.
	public void enqueue(T element) {
		Node<T> node = new Node<T>(element);
		if (isEmpty()) {
			head = node;
		} else {
			tail.setNext(node);
		}
		tail = node;
	}

	// Entfernt das Objekt am Anfang.
	public T dequeue() {
		if (isEmpty()) {
			return null;
		} else {
			Node<T> prev = head;
			head = prev.getNext();
			return prev.getObject();
		}
	}

	public void printQueue() {
		String printQueue = "";
		Node<T> currentNode = head;
		while (currentNode != null) {
			printQueue = printQueue + " -> " + currentNode.getObject();
			currentNode = currentNode.getNext();
		}
		System.out.println(printQueue);
	}

	public static void main(String[] args) {
		IterableQueue<Person> persons = new IterableQueue<Person>();
		persons.enqueue(new Person("Elon Musk"));
		persons.printQueue();

		persons.enqueue(new Person("Jeff Bezos"));
		persons.printQueue();

		persons.enqueue(new Person("Sundar Pichai"));
		persons.printQueue();

		persons.dequeue();
		persons.printQueue();

		IterableQueue<Hausaufgabe> aufgaben = new IterableQueue<Hausaufgabe>();
		aufgaben.enqueue(new Hausaufgabe("Informatik", "programmieren"));
		aufgaben.printQueue();

		aufgaben.enqueue(new Hausaufgabe("Mathematik", "rechnen"));
		aufgaben.printQueue();

		aufgaben.enqueue(new Hausaufgabe("Physik", "simulieren"));
		aufgaben.printQueue();

		aufgaben.dequeue();
		aufgaben.printQueue();
	}
}
