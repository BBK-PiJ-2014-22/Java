
public class IntSetTree implements IntSet {

	IntSetTreeNode head;
	

	public IntSetTree(){
		head = null;
	}
	
	@Override
	public void add(int number) {
		if (this.head == null){
			this.head = new IntSetTreeNode(number);
		}else{
			head.add(number);
		}
	}

	@Override
	public boolean contains(int number) {
		if (this.head == null) return false;
		else return head.contains(number);
	}

	@Override
	public boolean containsVerbose(int number) {
		if (this.head == null){
			System.out.println("No head assigned");
			return false;
		}else{
			return head.containsVerbose(number);
		}
	}
	
	@Override
	public String toString(){
		if (this.head == null) return "null";
		else return head.toString();
	}
}
