

public class Supermarket {

	PersonQueue queue = new PersonQueueLink(); 
	
	public static void main(String[] args) {
		
		
		Supermarket tescos = new Supermarket();
		tescos.launch();
		
	}

	private void launch(){
		int customers = 0;
		
		for (int i = 0; i < 10 ; i++){
			this.addPerson(new Person("Customer "+ i));
		}
		
		for (int i = 0; i < 11 ; i++){
			System.out.println(this.servePerson());
		}
	}
	
	private void addPerson(Person customer){
		this.queue.insert(customer);
	}
	
	private Person servePerson(){
		return queue.retrieve();	
	}
	
	
	
	
}


