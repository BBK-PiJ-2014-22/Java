
public class Script {

	public static void main(String[] args) {
		Script script = new Script();
		script.launch();
	}

	public void launch(){
		MobilePhone mobile = new SmartPhone("Fairphone");
		SmartPhone smart = (SmartPhone) mobile;
		
			System.out.println("Smart functions:");

			smart.call("00123456789");
			smart.browseWeb("www.google.com");
			smart.findPosition("Here");
			System.out.println();
			
			System.out.println("Mobile functions:");
			System.out.println(smart.displayDialled());
			System.out.println("");
			
			System.out.println("Old functions:");
			System.out.println(smart.getBrand());	
			smart.call("0123456789");
		
		
	}
}
