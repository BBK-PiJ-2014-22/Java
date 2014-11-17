
public class PersonQueueTest {

	public static void main(String args[]){
		

		PersonQueue pq = new PersonQueueLink();
		
		Person head = new Person("Bob Geldoff 1");
		
		pq.insert(head);
		pq.insert(new Person("Bob Geldoff 2"));
		pq.insert(new Person("Bob Geldoff 3"));
		pq.insert(new Person("Bob Geldoff 4"));
		pq.insert(new Person("Bob Geldoff 5"));
		pq.insert(new Person("Bob Geldoff 6"));
		pq.insert(new Person("Bob Geldoff 7"));
		pq.insert(new Person("Bob Geldoff 8"));

		

		do{
			head = pq.retrieve();
			System.out.println(head);
		} while (head != null);
	}
}


