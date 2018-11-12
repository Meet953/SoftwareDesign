

import java.rmi.*;
import java.rmi.server.*;

class NameImpl extends UnicastRemoteObject implements NameTestInterface {
	 private String first, surname;

   public NameImpl( String f, String s ) throws RemoteException 
   {
         first = f; surname = s;
    }

   

@Override
public String readName() throws RemoteException {
	// TODO Auto-generated method stub
	return first +" "+ surname;
}

@Override
public void updateSurname(String nm) throws RemoteException {
	// TODO Auto-generated method stub
	surname=nm;
}
}