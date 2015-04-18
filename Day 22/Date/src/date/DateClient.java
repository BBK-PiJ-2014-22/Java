package date;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.DateFormat;
import java.text.SimpleDateFormat;



public class DateClient {
	
	DateFormat format;
	
	public DateClient(){
		this.format = new SimpleDateFormat("YYYY/MM/DD HH:MM:SS");
	}

	public static void main(String[] args) {
		DateClient client = new DateClient();
		client.launch();

	}
	
	public void launch(){
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		try {
			String name = "Date";
			Registry registry = LocateRegistry.getRegistry(0);
			System.out.println("Position 1");
			DateService dateService = (DateService) registry.lookup(name);
			System.out.println("Position 2");
			System.out.println(format.format(dateService.getDate()));
		}catch (Exception e){
			System.err.println("Date client exception");
			e.printStackTrace();
		}
	}
}
