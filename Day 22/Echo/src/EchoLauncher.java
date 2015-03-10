
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


@SuppressWarnings("deprecation")
public class EchoLauncher {

	public static void main(String[] args){
		
		launch();
		
	}
	
	
	public static void launch(){
		if (System.getSecurityManager() == null){
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			LocateRegistry.createRegistry(1099);
			EchoImpl server = new EchoImpl();
			String registryHost = "//127.0.0.1:1099/";
			String serviceName = "echo";
			Naming.rebind(registryHost + serviceName, server);
			
		}catch (MalformedURLException ex) {
			ex.printStackTrace();
			System.out.println("error url");
		}catch (RemoteException ex) {
			ex.printStackTrace();		
			System.out.println("error rmi");
		}
	}	
}
