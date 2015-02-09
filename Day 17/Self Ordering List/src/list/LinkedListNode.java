package list;

public class LinkedListNode {
	
	Object value;
	int position;
	LinkedListNode next;
	
	public LinkedListNode(Object value, int position){
		this.value = value;
		this.position = position;
	}
	
	public void add(Object object){
		if (this.next == null)
			this.next = new LinkedListNode(object, this.position+1);
		else
			this.next.add(object);
	}
	
	public Object get(int i){
		if (this.position == i)
			return this.value;
		else if (this.next != null)
			return this.next.get(i);
		else
			return null;
	}

	
}
