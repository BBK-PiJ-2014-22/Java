import calllist.*;

public class MobilePhone extends OldPhone {

	private String ringAlarm = "Ring Ring";
	public CallList dialled = new CallListImpl();
	
	public void call(String number){
		super.call(number);
		dialled.add(number);
	}
	
	
}
