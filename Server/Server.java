import java.rmi.*;
import java.net.*;

/* Server */
public class Server{

	/* Main */
	public static void main(String[] args){
		try{
			/* Create an instance of interface implementation */
			MyRMI_Impl rObjImpl = new MyRMI_Impl();
			System.out.println(">Remote object instantiated");
			/* Bind the object into rmiregistry */
			Naming.rebind("rmi://localhost/RemoteObject", rObjImpl);
			System.out.println(">Remote object registered into rmiregistry");

		} 
		catch (RemoteException  re){ re.printStackTrace(); }
		catch (MalformedURLException mue) { mue.printStackTrace(); }
	}	
}