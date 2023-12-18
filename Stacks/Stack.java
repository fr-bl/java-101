public class Stack<T> {

	public class Node<T> {
		private Node<T> next;
		private T object;

		public Node(T obj){
			next = null;
			this.object = obj;
		}

		public Node<T> getNext(){
			return next;
		}

		public void setNext(Node<T> next){
			this.next = next;
		}

		public T getObject(){
			return object;
		}
    }

	Node<T> head;

	public Stack(){
		head = null;
	}

	public boolean isEmpty(){
		return head == null;
	}

    //Gibt das oberste Element zurueck, ohne es zu entfernen.
	public T top(){
		if (isEmpty()) {
			return null;
		} else {
			return head.getObject();
		}
	}

    //Fuegt ein Element zum Stapel hinzu.
	public void push(T element){
		Node<T> node = new Node<T>(element);
		node.setNext(head);
		head = node;
	}

    //Loescht das oberste Element.
	public T pop() {
        Node<T> prev = head;
		if (head != null) {
			head = head.getNext();
		}
		return prev.getObject();
	}

	public void printStack() {
		String printStack = "";
		Node<T> currentNode = head;
		while(currentNode != null){
			printStack = printStack + " \n " + currentNode.getObject();
			currentNode = currentNode.getNext();
		}
		System.out.println(printStack);
	}

	public static void main(String[] args){
		Stack<Befehl> stack = new Stack<Befehl>();
		stack.push(new Befehl("Grafik einfuegen"));
		stack.printStack();

		stack.push(new Befehl("Ueberschrift formatieren"));
		stack.printStack();

		stack.push(new Befehl("Grafik loeschen"));
		stack.printStack();

		stack.pop();
		stack.printStack();
	}
    
}
