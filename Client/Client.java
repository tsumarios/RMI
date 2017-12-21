import java.rmi.*;
import java.net.*;

/* Client */
public class Client{
	
	/* Main */
	public static void main(String[] args){

		try{
			/* Create an istance for remote object */
			MyRMI rObj = (MyRMI) Naming.lookup("rmi://localhost/RemoteObject");
			rObj.remoteMethod();
		}
		catch(RemoteException re) { err.printStackTrace(); }
		catch(NotBoundException nbe) { nbe.printStackTrace(); }
		catch(MalformedURLException mue) { mue.printStackTrace(); }
		
	}	
}