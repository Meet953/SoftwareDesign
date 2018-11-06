import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class MatchServer {
	 public static  void main( String args[] ) {
	 		Scanner sc = new Scanner(System.in);
	    	 try { 
	             LocateRegistry.createRegistry(1099); 
	             System.out.println("java RMI registry created.");
	         } catch (RemoteException e) {
	        	 System.out.println( "Error: " + e );
	         }
	    	 System.out.println("Enter Team 1:"); 
	    	 String t1=sc.next();
	    	 System.out.println("Enter Team 2:"); 
	    	 String t2=sc.next();
	     
	         try {
	             MatchImpl p1 = new MatchImpl( t1,t2);
	              Naming.rebind( "toaster", p1 );
	         }
	         catch( Exception e ) { System.out.println( "Error: " + e ); }
	     }
}
