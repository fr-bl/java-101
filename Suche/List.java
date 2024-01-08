public class List<T> {

	public class Node<T>{
		private Node<T> nextNode;
		private Node<T> prevNode;
		private T obj;

		public Node(T pObj){
			nextNode = null;
			prevNode = null;
			obj = pObj;
		}

		public Node<T> getNextNode(){
			return nextNode;
		}

		public Node<T> getPrevNode(){
			return prevNode;
		}

		public void setNextNode(Node<T> pNextNode){
			nextNode = pNextNode;
		}

		public void setPrevNode(Node<T> pPrevNode){
			prevNode = pPrevNode;
		}

		public T getObject(){
			return obj;
		}
    }

	//Referenzen auf Knoten
	private Node<T> first;
	private Node<T> last;

	private Node<T> current;



	public List(){
		first = null;
		last = null;
		current = null;
	}

	public boolean isEmpty(){
		return first == null && last == null;
	}


	public void append(T element){
		Node<T> newNode = new Node<T>(element);
		if(isEmpty()){
			first = newNode;
			last = newNode;
		} else {
			last.setNextNode(newNode);
			newNode.setPrevNode(last);
			last = newNode;
		}

	}

	public void insert(T element){
		Node<T> newNode = new Node<T>(element);
		if(isEmpty()){
			System.out.println("Es gibt kein aktuelles Element.");
		}else if(current == null){
			System.out.println("Es gibt kein aktuelles Element.");
		} else if(current == last){
			current.setNextNode(newNode);
			newNode.setPrevNode(current);
			current = newNode;
			last = current;
		} else{
			current.getNextNode().setPrevNode(newNode);
			newNode.setPrevNode(current);
			newNode.setNextNode(current.getNextNode());
			current.setNextNode(newNode);
			current = newNode;
		}
	}

	public void remove(){
		if(isEmpty()){
			System.out.println("Die Liste ist leer.");
		} else if(current == null){
			System.out.println("Es gibt kein aktuelles Element.");
		} else if(current == first && current == last){
			first = null;
			last = null;
			current = null;
		} else if(current == first){
			current.getNextNode().setPrevNode(null);
			current = current.getNextNode();
			first = current;
		} else if(current == last){
			current.getPrevNode().setNextNode(null);
			last = current.getPrevNode();
			current = null;
		} else{
			current.getPrevNode().setNextNode(current.getNextNode());
			current.getNextNode().setPrevNode(current.getPrevNode());
			current = current.getNextNode();
		}
	}

	public void toFirst(){
		if(isEmpty()){
			System.out.println("Die Liste ist leer.");
		} else{
			current = first;
		}
	}

	public void toLast(){
		if(isEmpty()){
			System.out.println("Die Liste ist leer.");
		} else{
			current = last;
		}
	}

	public void next(){
		if(isEmpty()){
			System.out.println("Die Liste ist leer.");
		} else if (current == null){
			System.out.println("Es gibt kein aktuelles Element.");
		} else{
			current = current.getNextNode();
		}
	}

	public void prev(){
		if(isEmpty()){
			System.out.println("Die Liste ist leer.");
		} else if (current == null){
			System.out.println("Es gibt kein aktuelles Element.");
		} else{
			current = current.getPrevNode();
		}
	}

	public T getContent(){
		if(isEmpty()){
			return null;
		} else if (current == null){
			return null;
		} else{
			return current.getObject();
		}
	}

	public void printList(){
		String printList = "[";
		Node<T> currentNode = first;
		while(currentNode != null && currentNode.getNextNode() != null){
			printList = printList + currentNode.getObject() + ", ";
			currentNode = currentNode.getNextNode();
		}
		if(currentNode != null){
			printList = printList + currentNode.getObject();
		}
		printList = printList + "]";
		System.out.println(printList);
	}

	public static void main(String[] args){
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
