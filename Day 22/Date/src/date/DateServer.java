package date;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateServer extends UnicastRemoteObject implements DateService {

	private static final long serialVersionUID = 1732756121486912460L;
	private static final DateFormat FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");

	
	public DateServer() throws RemoteException{
		//Do nothing
	}
	
	@Override
	public Date getDate() throws RemoteException {
		Date result = new Date();
		System.out.println(FORMAT.format((result)));
		return new Date();
	}
	

}

