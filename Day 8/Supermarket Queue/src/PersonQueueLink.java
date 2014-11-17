
public class PersonQueueLink implements PersonQueue{

	private Person head;
	
	public Person getHead() {
		return head;
	}


	private void setHead(Person head) {
		this.head = head;
	}
	
	public void insert(Person person){
		if (head == null){
			head = person;
		}else {
			head.setNext(person);
		}
	}
	
	
	public Person retrieve(){
		if (this.getHead() == null){
			return null;
		}else{
			Person result = this.getHead();
			this.setHead(result.getNext());
			return result;
		}
	}
}
