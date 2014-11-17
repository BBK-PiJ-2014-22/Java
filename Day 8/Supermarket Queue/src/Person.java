
public class Person {

	private String name;
	private Person nextPerson;
	
	
	public Person(String name){
		this.setName(name);
	}
	
	@Override
	public String toString(){
		return this.getName();
	}
	
	public String getName(){
		return this.name;
	}

	public void setName(String str){
		this.name = str;
	}
	
	public Person getNext(){
		return this.nextPerson;
	}
	
	public void setNext(Person person){
		if (this.nextPerson == null){
			this.nextPerson = person;
		}else {
			this.nextPerson.setNext(person);		
		}
	}
}
	
	
	

