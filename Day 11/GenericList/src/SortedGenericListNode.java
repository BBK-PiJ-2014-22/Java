
public class SortedGenericListNode<T extends Comparable> extends GenericListNode<T> {
	
	private T value;
	public SortedGenericListNode(T value){
		super(value);
	}
	
	@Override
	public void add(T value){
		if (value.compareTo(value) < 0){
			
		}
		//int test = this.compareTo<T>(value);	
	}
/*
	public int compareTo(T value){
		if (value.compareTo(this.value) < 0){
			//do something
		}
		else {
			//do something
		}
		return 0;

	}
	*/
}

	
