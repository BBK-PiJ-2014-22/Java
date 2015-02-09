package list;

public class LinkedList {
	
	LinkedListNode head;
	boolean sorted = true;
	
	public LinkedList(){
		this.head = null;
	}
	
	public void add(Object object){
		if (head == null)
			this.head = new LinkedListNode(object, 0);
		else
			this.head.add(object);

		sorted = false;
		notifyAll();
	}
	
	public Object get(int i){
		return head.get(i);
	}	
}
