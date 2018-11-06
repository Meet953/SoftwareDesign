import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AccountImpl extends UnicastRemoteObject implements Account {

	 private String name;
		private int number;
		private int transactions;
		private int balance;
	
	 public AccountImpl( String n,int no ) throws RemoteException 
	   {
		 name=n;
		    number=no;    transactions=0;
		    balance=0;
	    }

	 public String read_bal()
		{   //transactions++;
			return ""+balance;
		}
	 
		public String read_name()
		{
			return name;
		}
		
		public int read_number()
		{
			return number;
		}
		
		public int read_transactions()
			{
				return transactions;
		    }
		
		public void deposit(int a)
		{   transactions++;
			balance+=a;
		}
		
		public boolean withdraw(int a)
		{   transactions++;
			balance-=a;
			return  true;}

}
