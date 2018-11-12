

import java.rmi.*;
interface NameTestInterface extends Remote {

 
	public String readName() throws RemoteException;
	public void updateSurname(String nm) throws RemoteException;
	 
	
}