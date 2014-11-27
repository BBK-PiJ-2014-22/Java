
public class IntSetListNode {
	
	int value;
	IntSetListNode next;
	
	public IntSetListNode(int number){
		value = number;
		next = null;
	}
	
	public boolean contains(int number){
		if (this.value == number){
			return true;
		}else if (this.next == null){
			return false;
		}else{
			return next.contains(number);
		}
	}
	
	public boolean containsVerbose(int number){
		System.out.println("Comparing "+this.value+":"+number);
	
		if (this.value == number){
			return true;
		}else if (this.next == null){
			return false;
		}else{
			return next.containsVerbose(number);
		}
	}
	
	public void add(int number){
		if (!this.contains(number)){
			if (this.next == null){
				this.next = new IntSetListNode(number);
			}else{
				this.next.add(number);
			}
		}
	}
	
	@Override
	public String toString(){
		if (this.next == null){
			return "["+this.value+"]";
		}else{
			return "["+this.value+"]"+", "+this.next.toString();
		}
	}
	
}
