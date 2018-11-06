import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class AccountServer {
	 public static  void main( String args[] ) {
	 		Scanner sc = new Scanner(System.in);
	    	 try { 
	             LocateRegistry.createRegistry(1099); 
	             System.out.println("java RMI registry created.");
	         } catch (RemoteException e) {
	        	 System.out.println( "Error: " + e );
	         }
	    	 System.out.println("Enter Your Name:"); 
	    	 String nm=sc.next();
	    	 System.out.println("Enter Your Account No.:"); 
	    	 int ac=sc.nextInt();
	    	 System.out.println(nm);
	         try {
	              AccountImpl p1 = new AccountImpl( nm,ac);
	              Naming.rebind( "toaster", p1 );
	         }
	         catch( Exception e ) { System.out.println( "Error: " + e ); }
	     }
}
