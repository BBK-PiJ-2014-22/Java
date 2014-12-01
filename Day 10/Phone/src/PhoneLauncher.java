
public class PhoneLauncher {

	public static void main(String[] args) {

		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch(){
		SmartPhone phone = new SmartPhone("Fairphone");

		phone.call("01234 567899");
		phone.call("01234 567898");
		phone.call("001234 567897");
		
	
		System.out.println(phone.dialled);
		phone.browseWeb("www.thingy.com");
		

		System.out.println(phone.dialled);
		
		phone.findPosition("Here!");
	}

}
