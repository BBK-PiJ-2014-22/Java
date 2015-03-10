import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EchoImpl extends UnicastRemoteObject implements EchoService  {
	
	public EchoImpl() throws RemoteException{
		//Nothing
	}
	
	
	@Override
	public String echo(String entry) throws RemoteException{
		System.out.println(entry);
		return entry;
	}
	

}
