import calllist.*;

public class MobilePhone extends OldPhone {

	private String brand = null;
	
	public MobilePhone(String brand) {
		super(brand);
	}
	
	
	private String ringAlarm = "Ring Ring";
	public CallList dialled = new CallListImpl();
	
	public void call(String number){
		super.call(number);
		dialled.add(number);
	}
	
	public String displayDialled(){
		return dialled.toString();
	}
	
	
}
