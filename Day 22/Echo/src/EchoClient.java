import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class EchoClient {

	public static void main(String[] args) {
		
	}
	
	public static void launch(String echo){
		if (System.getSecurityManager() == null){
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
		
			Remote service = Naming.lookup("127.0.0.1:1099/echo");
			EchoService echoService = (EchoService) service;
			
			String receivedEcho = echoService.echo(echo);
			System.out.println(receivedEcho);
			
		}catch (MalformedURLException ex) {
			ex.printStackTrace();;
		}catch (RemoteException ex) {
			ex.printStackTrace();		
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		}
	}	

}
