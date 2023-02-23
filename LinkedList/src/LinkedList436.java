
public class LinkedList436 {
	private int counter;
	private Node head;
 
	// appends the specified element to the end of this list.
	public void add(Object data) {
		if (head == null) {
			head = new Node(data);
			counter++;
			return;
		}
		Node temp = new Node(data);
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		counter++;
	}
	
	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		int i = 0;
		Node temp = new Node(data);
		Node current = head;
		while (i < index - 1) {
			if (current == null) {
				throw new IndexOutOfBoundsException();
			}
			current = current.getNext();
			i++;
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
		counter++;
	}
	
	// returns the element at the specified position in this list.
	public Object get(int index){
		if (index < 0 || index >= counter) {
			throw new IndexOutOfBoundsException();
		}
		int i = 0;
		Node current = head;
		while (i < index) {
			if (current == null) {
				throw new IndexOutOfBoundsException();
			}
			current = current.getNext();
			i++;
		}
		return current.getData();
	}
 
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
		if (index < 0 || index >= counter) {
			throw new IndexOutOfBoundsException();
		}
		int i = 0;
		Node current = head;
		while (i < index - 1) {
			if (current == null) {
				throw new IndexOutOfBoundsException();
			}
			current = current.getNext();
			i++;
		}
		current.setNext(current.getNext().getNext());
		counter--;
		return true;
	}
 
 
	// returns the String content of all the nodes in this list. 
	public String toString() {
		String output = "[";
		if (head == null) {
			return "[]";
		}
		Node current = head;
		while (current != null) {
			output += current.getData().toString() + ",";
			current = current.getNext();
		}
		output = output.substring(0, output.length() - 1) + "]";
		return output;
	}
 
	// returns the number of elements in this list.
	public int size() {
		return counter;
	}
	
	
	private class Node {
		// reference to the next node in the chain, or null if there isn't one.
		Node next;

		// data carried by this node. could be of any type you need.
		Object data;

		// Node constructor
		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}

		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}

		@SuppressWarnings("unused")
		public void setData(Object dataValue) {
			data = dataValue;
		}
			
		// return the next node of the current node
		public Node getNext() {
			return next;
		}
			
		public void setNext(Node nextValue) {
			next = nextValue;
		}
	}
}
