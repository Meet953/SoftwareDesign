import java.rmi.Naming;
import java.util.Scanner;

public class NameClient {

	 public static void main( String args[] ) {

         String url =  "rmi://192.168.23.77/";
        
         int choice = 1;
 		Scanner sc = new Scanner(System.in);
         try {
        	  Name n = ( Name ) Naming.lookup( url + "toaster" );
      //String url= "rmi://193.1.24.1/";      // if object located remotely
        		while(choice!=3)
        		{
                 System.out.println();
        		 System.out.println("1.Change Surname");
        		 System.out.println("2.Print_Name");
        		 System.out.println("3.Exit");

        			System.out.print("\nPlease enter a value-->");
        			choice=sc.nextInt();
        		 if(choice==1)
        			{
        			 System.out.print("\nEnter new surname-->");
        			 String nm=sc.next();
        			 n.updateSurname(nm);
        			}



        			else if(choice==2)
        			{
        				String res=n.readName();
        				System.out.println(res);
        			}

        		}  // end while
                } catch( Exception e ) {
         System.err.println( "Error " + e );}
    }
	
}
