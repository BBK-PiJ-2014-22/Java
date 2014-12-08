
public class GenericListNode<T>{

	GenericListNode next;
	GenericListNode last;
	T value;
	
	
	public GenericListNode(T value2) {
		this.value = value2;
	}

	public void add(T value){
		if (this.next == null){
			this.next = new GenericListNode<T>(value);
			this.next.last = this;
		}else{
			this.next.add(value);
		}
	}
	
	@Override
	public String toString(){
		String result = this.value.toString();
		if (this.next == null){
			return result;
		}else{
			return (result+"\n"+this.next.toString());
		}
	}
}
