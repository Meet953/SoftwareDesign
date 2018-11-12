

import java.rmi.*;
interface Name extends Remote {

 
	public String readName() throws RemoteException;
	public void updateSurname(String nm) throws RemoteException;
	 
	
}