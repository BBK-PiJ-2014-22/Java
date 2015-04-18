package date;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.text.DateFormat;
import java.text.SimpleDateFormat;



public class DateEngine{
	
	public static final DateFormat DATEFORMAT =  new SimpleDateFormat("DD/MM/YYYY HH:MM:SS");
	
	public static void main(String args[]){
		DateEngine engine = new DateEngine();
		
		engine.launch();
	}
	
	public void launch(){
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		try {
			LocateRegistry.createRegistry(0);
			DateServer server = new DateServer();
			String registryHost = "//localhost/";
			String serviceName = "Date";
			Naming.rebind(registryHost + serviceName, server);
		}catch (MalformedURLException ex) {
			ex.printStackTrace();
		}catch (RemoteException ex){
			ex.printStackTrace();
		}
	}
}
