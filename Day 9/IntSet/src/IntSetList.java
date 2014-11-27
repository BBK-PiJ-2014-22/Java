
public class IntSetList implements IntSet {

	IntSetListNode head;
	
	@Override
	public String toString(){
		if (head == null) return "null";
		else return head.toString();
	}
	
	public void add(int number){
		if (head != null) head.add(number);
		else head = new IntSetListNode(number);
	}
	
	public boolean contains(int number){
		if (head == null) return false;
		else return head.contains(number);
	}
	
	public boolean containsVerbose(int number){
		if (head == null) return false;
		else return head.containsVerbose(number);
	}
	
	
	
}
