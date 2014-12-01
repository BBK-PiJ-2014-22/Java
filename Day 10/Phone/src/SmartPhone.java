
public class SmartPhone extends MobilePhone {

	public void browseWeb(String website){
		System.out.println(website);
	}
	
	public void findPosition(String location){
		System.out.println("You are here: "+location);
	}

	public void call(String number){
		if (number.substring(0,2).equals("00")){
			System.out.println("Skype Calling "+number);
		}else{
			super.call(number);
		}
	}
	
	
}
