import java.rmi.*;
import java.util.*;

/* Remote interface implementation */
public class MyRMI_Impl extends UnicastRemoteObject implements MyRMI{
	/* Constructor */
	public MyRMI_Impl() throws RemoteException{
		super();
	}

	/* Remote method */
	public void remoteMethod()	throws RemoteException{
		
	}
		
}