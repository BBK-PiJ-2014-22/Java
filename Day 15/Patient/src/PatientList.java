import java.util.ArrayList;

public class PatientList {
	
	 ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public PatientList(){
		this.patients = new ArrayList<Patient>();
	}
	
	@Override
	public String toString(){
		return this.patients.toString();
	}
		
	public void add(String name, int age){
		try{
			this.patients.add(new Patient(name, age));
		}catch (IllegalArgumentException ex){
			System.out.println("Age must be between 0 and 130");
		}
	}
	
	
}
