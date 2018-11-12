import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*; 
import java.util.Scanner;


public class NameServer {
     public static  void main( String args[] ) {
 		Scanner sc = new Scanner(System.in);
    	 try { 
             LocateRegistry.createRegistry(1099); 
             System.out.println("java RMI registry created.");
         } catch (RemoteException e) {}
    	 System.out.println("Enter Your First Name:"); 
    	 String nm=sc.next();
    	 System.out.println("Enter Your Last Name:"); 
    	 String lm=sc.next();
    	 System.out.println(nm + " " + lm);
         try {
              NameImpl p1 = new NameImpl( nm, lm);
              Naming.rebind( "simon", p1 );
         }
         catch( Exception e ) { System.out.println( "Error: " + e ); }
     }
}