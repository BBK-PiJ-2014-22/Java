package calllist;
/**Node for CallLIstImpl*/
public class CallListImplNode implements CallList {


	CallListImplNode next;
	String number;
	int position;
	
	public CallListImplNode(String number){
		this.next = null;
		this.number = number;
		this.position = 0;	
	}
	
	@Override
	public String toString(){
		return position+":"+number;
	}
	
	@Override
	public void add(String number) {
		position += 1;
		if (this.next == null){
			this.next = new CallListImplNode(number);
		}else{
			this.next.add(number);
		}
	}

}
