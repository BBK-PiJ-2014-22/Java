public class Patient {
	 
	String name;
	int age;
	
	public Patient(String name, int age){
		name = name;
		
		if (age < 0 || age > 130){
			throw new IllegalArgumentException();
		}
	}
	

}
