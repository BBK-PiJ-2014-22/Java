
public class GenericList<T> {

	GenericListNode<T> head;
	
	public void add(T value){
		if (head == null){
			head = new GenericListNode<T>(value);
		}else{
			head.add(value);
		}
	}
	
	public String toString(){
		if (head == null){
			return null;
		}else{
			return head.toString();
		}
	}
	
	
}
