package calllist;


/**Implements CallList as a linked list*/
public class CallListImpl implements CallList {
	
	CallListImplNode head;
	
	@Override
	public String toString(){
		if (head == null){
			return null;
		}else{
			CallListImplNode current = head;
			String result = "";
			for (int i = 0; i  < head.position ; i++ ){
				result += current.toString()+"\n";
				current = current.next;
			}
			return result;
		}
	}
	
	@Override
	public void add(String number) {
		if (head == null){
			head = new CallListImplNode(number);
		}else{
			if (head.position == 10){
			head = head.next;
			}
			head.add(number);
		}
	}
}
