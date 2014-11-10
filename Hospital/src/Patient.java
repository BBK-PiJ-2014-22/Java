import java.util.Scanner;

public class Patient {

	private String name;
	private Patient nextPatient;
	private Patient lastPatient;
	
	public Patient(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		return this.name;
	}
	
	
	public void addPatient(Patient newPatient){
		if (this.nextPatient == null){
			this.nextPatient = newPatient;
		}else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public void delPatient(String name){
		if (this.name == name){
			this.lastPatient.nextPatient = this.nextPatient;
		} else if (! (this.nextPatient == null)){
			this.nextPatient.delPatient(name);		
		} else {
			System.out.println("No patient found to delete");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
