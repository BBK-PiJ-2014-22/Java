import java.rmi.RemoteException;

public class EchoImpl implements EchoService  {
	
	@Override
	public String echo(String entry) throws RemoteException{
		return entry;
	}
	

}
