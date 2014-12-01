
public class PhoneLauncher {

	public static void main(String[] args) {

		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch(){
		MobilePhone phone = new MobilePhone();

		phone.call("01234 567899");
		phone.call("01234 567898");
		phone.call("01234 567897");
		phone.call("01234 567896");
		phone.call("01234 567895");
		phone.call("01234 567894");
		phone.call("01234 567893");
		phone.call("01234 567892");
		phone.call("01234 567891");
		phone.call("01234 567890");
		System.out.println(phone.dialled);
		
		phone.call("01234 567889");
	
		System.out.println(phone.dialled);
	
		phone.call("01234 567888");
		phone.call("01234 567887");
		phone.call("01234 567886");

		System.out.println(phone.dialled);
		
	}

}
