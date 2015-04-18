package date;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface DateService extends Remote {

	public Date getDate() throws RemoteException;
	
}
