import java.rmi.*;

/* Remote interface */
public interface MyRMI extends Remote{
	
	/* Remote method */
	public void remoteMethod()	throws RemoteException;
		
}