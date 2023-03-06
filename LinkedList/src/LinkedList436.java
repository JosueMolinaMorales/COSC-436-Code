
public class LinkedList436 {
	private int counter;
	private Node head;
 
	// appends the specified element to the end of this list.
	public void add(Object data) {
		if(head == null){
            head = new Node(data);
        }else{
            Node current = head;
            //get to end of LL
            while(current.getNext() != null){
                current = current.getNext();
            }
        current.setNext(new Node(data));
        }
        counter++;
	}
	
	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		 //check to see if index is appropriate:
         if(index < 0 || index > counter){
            throw new IndexOutOfBoundsException();
         }else if(index == 0){
            //make newFrontNode point to head, then set head equal to that new node
            Node newFrontNode = new Node(data);
            newFrontNode.setNext(head);
            head = newFrontNode; 
         }else{
            //curr = current
            Node curr = head;
            Node newGuy = new Node(data);

            //get to the specified index
            for(int i = 0; i < index - 1; i++){
                curr = curr.getNext();
            } 
            //set new node, make it point to curr + 1, and then make curr point to it
            newGuy.setNext(curr.getNext());
            curr.setNext(newGuy);
        }
        counter++;
	}
	
	// returns the element at the specified position in this list.
	public Object get(int index){
        if(index < 0 || index > counter){
            throw new IndexOutOfBoundsException();
        }else{
        Node curr = head; 
        for(int j = 0; j < index; j++){
            curr = curr.getNext();
        }
        return curr.getData();
	}
}
 
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
        if(index < 0 || index > counter){
            throw new IndexOutOfBoundsException();
        }else{
		 Node curr = head;
         for(int i = 0; i < index - 1; i++){
            curr = curr.getNext();
         }
         Node nextnext = curr.getNext().getNext();
         curr.setNext(nextnext);
         //now call garbage collector?
        }
        counter --;
        return true;
	}
 
 
	// returns the String content of all the nodes in this list. 
	public String toString() {
        String bigString = "";
        Node curr = head;
        if(curr != null){
        bigString = curr.getData().toString();
		 for(int i = 0; i < counter - 1; i++){
            bigString +=  ( "-->" + curr.getNext().getData().toString());
            curr = curr.getNext();
         }
        //  return bigString;	
        }
        return bigString;
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
        // PLEASE INPLEMENT YOUR CODE HERE
            data = dataValue;
            next = null;
        }
    
        // these methods should be self-explanatory
        public Object getData() {
            return data;
        }
    
        //not used?
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