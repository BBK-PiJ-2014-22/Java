
public class ArkTest {

	public static void main(String[] args){
		ArkTest tester = new ArkTest();
		tester.launch();
	}
	
	public void launch(){
		
		Ark ark = new Ark();
		
		for (int i = 0; i < 45 ; i++){
			ark.add(new Animal());
		}
		
		System.out.println(ark.onBoard[0]);
	}
}
